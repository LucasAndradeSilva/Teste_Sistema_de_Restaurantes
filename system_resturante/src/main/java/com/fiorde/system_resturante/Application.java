package com.fiorde.system_resturante;

import com.fiorde.system_resturante.model.Restaurante;
import com.fiorde.system_resturante.repository.RestauranteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Profile("demo")
    @Bean
    CommandLineRunner initDatabase(RestauranteRepository repository) {
        return args -> {
            repository.save(new Restaurante("Las Arthes"));
			repository.save(new Restaurante("Las Torres"));
			repository.save(new Restaurante("El Macho"));
        };
    }
}
