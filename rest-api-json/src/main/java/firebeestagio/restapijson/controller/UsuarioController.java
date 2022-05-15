package firebeestagio.restapijson.controller;

import firebeestagio.restapijson.model.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import firebeestagio.restapijson.repository.UsuarioRepository;

import java.awt.print.Book;
import java.util.List;

@RestController
public class UsuarioController {

    //classe para fazer a consulta e salvar no banco de dados

    @Autowired
    private UsuarioRepository repository;


    @GetMapping(path = "/api/usuario/{codigo}") // consultar usuario pelo codigo
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
        //se por acaso retornou alguma coisa, trazer o ok e montar o corpo da requisição com o registro
        //caso contrario ele vai retornar um not found
    }

    @PostMapping(path = "/api/usuario/salvar")
    // um metodo post para salvar,
    // o requestbody para dizer que os dados do usuario serão
    // enviados  no corpo da req.
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){
        return repository.save(usuario);

    }
}
