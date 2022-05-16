package firebeestagio.restapijson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import firebeestagio.restapijson.model.UsuarioModel;
import firebeestagio.restapijson.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//essa é a classe principal da API

@SpringBootApplication // projeto Spring Boot
public class TesteDeEstagioApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteDeEstagioApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserService userService) { // codigo abaixo é do pacote jackson
		return args -> {
		// le o arquivo json e escrever no banco de dados
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<UsuarioModel>> typeReference = new TypeReference<List<UsuarioModel>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/Arquivo.json");
			try {
				List<UsuarioModel> usuarios = mapper.readValue(inputStream, typeReference);
				userService.save(usuarios);
				System.out.println("Usuarios Adicionados! Acesse o README do GitHUB de robbsjr para obter um resumo da API");
			} catch (IOException e){
				System.out.println("Nao foi possivel salvar os usuarios, talvez você tenha feito algo errado..." + e.getMessage());

			}
		};

	}
}
