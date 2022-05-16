package firebeestagio.restapijson.service;

import firebeestagio.restapijson.model.UsuarioModel;

import firebeestagio.restapijson.repository.UsuarioRepository2;
import org.springframework.stereotype.Service;

import java.util.List;

//Essa classe foi especialmente desenvolvida para que eu pudesse fazer a inclusao de diversos json de uma vez

@Service
public class UserService {

    private UsuarioRepository2 repository;

    public UserService(UsuarioRepository2 repository) {
        this.repository = repository;
    }

    public Iterable<UsuarioModel> list(){
        return repository.findAll();
    }

    public UsuarioModel save(UsuarioModel usuario){

        return repository.save(usuario);
    }

    public void save(List<UsuarioModel> usuarios){

        repository.saveAll(usuarios);

    }
}
