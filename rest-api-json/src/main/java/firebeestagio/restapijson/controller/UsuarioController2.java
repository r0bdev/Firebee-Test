package firebeestagio.restapijson.controller;

import firebeestagio.restapijson.model.UsuarioModel;
import firebeestagio.restapijson.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import firebeestagio.restapijson.repository.UsuarioRepository2;


@RestController
public class UsuarioController2 {

    @Autowired
    private UsuarioRepository2 repository;

    private UserService userService;

    public UsuarioController2(UserService userService) {
        this.userService = userService;
    }

    //É um método para fazer a consulta de um objeto único, buscando pelo atributo "id"
    @GetMapping(path = "/api/usuario/{id}") // consultar usuario pelo codigo
    public ResponseEntity consultar(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
        //se por acaso retornou alguma coisa, trazer o ok e montar o corpo da requisição com o registro
        //caso contrario ele vai retornar um not found
    }

    //esse é o método post para pegar objeto pelo postman
    @PostMapping(value = "/api/usuario/salvar")
    // o metodo post para salvar,
    // o requestbody para dizer que os dados do usuario serão enviados  no corpo da req.
    public void salvar(@RequestBody UsuarioModel usuario){

        repository.save(usuario);
      }

    //eu também realizei a inserção de dados json diretamente aqui na aplicação
    // no arquivo TesteDeEstagioApplication fiz um @Bean utiizando o pacote jackson, lá tem mais detalhes.

}
