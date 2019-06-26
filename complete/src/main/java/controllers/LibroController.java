package main.java.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LibroController {

    // standard constructors

    public LibroController(main.java.repositories.LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    private final main.java.repositories.LibroRepository libroRepository;

    @GetMapping("/libros")
    public List<main.java.entyties.Libro> getLibro() {
        return (List<main.java.entyties.Libro>) libroRepository.findAll();
    }

    @PostMapping("/libros")
    void addLibro(@RequestBody main.java.entyties.Libro libro) {
        libroRepository.save(libro);
    }
}