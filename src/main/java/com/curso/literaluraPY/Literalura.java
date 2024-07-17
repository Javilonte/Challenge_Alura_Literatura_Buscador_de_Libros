package com.curso.Literalura;

import com.curso.Literalura.principal.Principal;
import com.curso.Literalura.repository.AutorRepository;
import com.curso.Literalura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Literalura implements CommandLineRunner {
	@Autowired
	private LibroRepository repositoryLibro;

	@Autowired
	private AutorRepository repositoryAutor;

	public static void main(String[] args) {

		SpringApplication.run(Literalura.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositoryLibro, repositoryAutor);
		principal.muestraElMenu();
	}
}
