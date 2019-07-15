package br.com.capgemini.desafio.renata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.com.capgemini.desafio.renata.db.DbInitializer;

@SpringBootApplication
public class DesafioCapgeminiApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(DesafioCapgeminiApplication.class, args);

        context.getBean(DbInitializer.class).initialize();
	}

}
