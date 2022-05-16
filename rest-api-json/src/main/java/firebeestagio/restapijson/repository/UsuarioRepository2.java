package firebeestagio.restapijson.repository;

import firebeestagio.restapijson.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

//busca por id
//salva, atualiza, e etc

// repositorio Crud

public interface UsuarioRepository2 extends CrudRepository <UsuarioModel, Integer> {

    }
