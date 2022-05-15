package firebeestagio.restapijson.repository;

import firebeestagio.restapijson.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

//classe com métodos pré-prontos com principais funcionalidades
//busca por id
//busca por atributos
//salva, atualiza, e etc

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

}
