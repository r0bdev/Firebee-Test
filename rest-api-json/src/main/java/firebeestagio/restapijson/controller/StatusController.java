package firebeestagio.restapijson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    // essa classe serve para fazer consulta de status para saber se a aplicação está online

    @GetMapping(path = "/api/status")
    public String check() {
        return "A API - Teste de Estágio da FireBEE - está online!";

    }

}
