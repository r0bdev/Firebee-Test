package firebeestagio.restapijson.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//essa é a classe que modela minha tabela do banco de dados
//ou seja, representação do usuario no banco de dados

@Entity(name = "usuario") // digo utilizando este, que essa classe é uma tabela!
public class UsuarioModel {

    public UsuarioModel() {

    }

    @Id
    private int id;
    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, length = 50)
    private int idade;
    @Column(nullable = false, length = 15)
    private String login;
    @Column(nullable = false, length = 12)
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}