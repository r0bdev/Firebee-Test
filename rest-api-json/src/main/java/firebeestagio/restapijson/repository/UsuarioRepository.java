package firebeestagio.restapijson.repository;

import firebeestagio.restapijson.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

//classe com métodos pré-prontos com principais funcionalidades
//lista ordenado por por id

// repositorio Jpa

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

}
