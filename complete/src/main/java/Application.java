package main.java;

import main.java.entyties.Libro;
import main.java.repositories.LibroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication()
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(LibroRepository libroRepository) {
        return args -> {
            Libro libro1 = new Libro("Fundamentos de Programacion", "Lara, Juan Iruela", 2015); //Editorial: CreateSpace
            Libro libro2 = new Libro("System Analysis and Design", "Julie E Kendall", 2005); //Editorial: Prentice Hall
            Libro libro3 = new Libro("Teoría Y Práctica De Administración De Empresas", "Muñoz Bullon Y M Jose Sanchez ", 2019); //Editorial: Civitas

            libroRepository.save(libro1);
            libroRepository.save(libro2);
            libroRepository.save(libro3);

            libroRepository.findAll().forEach(System.out::println);
        };
    }

}
