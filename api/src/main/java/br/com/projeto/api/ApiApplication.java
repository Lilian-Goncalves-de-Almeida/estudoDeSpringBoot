package br.com.projeto.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {
	//como a porta 8080 está sendo usada e o computador não 
	//permite alterar foi colocado o caminho no C:\Users\lilian.goncalves\Documents\api\target application.properties 
	//o comando server.port=9000 para alterar a porta do localhost:8080 para localhost:9000, mas ele se exclui automaticamente
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
