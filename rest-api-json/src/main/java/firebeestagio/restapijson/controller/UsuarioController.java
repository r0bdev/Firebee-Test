package firebeestagio.restapijson.controller;

import firebeestagio.restapijson.model.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import firebeestagio.restapijson.repository.UsuarioRepository;

import java.util.List;

//Decidi usar tanto os Repositórios Jpa como o Crud, pois eles nos retornam métodos unicos que são muito uteis
//explicarei abaixo qual método utilizei do Jpa.

@RestController
@RequestMapping(value = "/api/usuario")
public class UsuarioController {


    @Autowired
    private UsuarioRepository repository;

    /* É um método para fazer a consulta de todos os objetos salvos no banco de dados
     O bonus é que nesse método utilizando a JPA, ele ja vem ordenado! Conforme requisitado.
     Na verdade, também tentei utilizar apenas o repositório CRUD, mas ele não me permitiu utilizar
     dois GetMapping e dois RespondeEntity, mas espero poder compreender melhor com os ensinamentos da
     equipe Firebee */

    @GetMapping(path = "/api/usuario/") // consultar lista de usuarios
    //vai mostrar um em cima do outro, no post ele consegue separar os JSON de forma mais organizada que o navegador.
    public ResponseEntity<List<UsuarioModel>> findAll(){
        List<UsuarioModel> result = repository.findAll();
        return ResponseEntity.ok(result);

        }

    }
