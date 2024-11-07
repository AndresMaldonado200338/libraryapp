package edu.uptc.swii.libraryapp.service;

import edu.uptc.swii.libraryapp.domain.Libro;
import edu.uptc.swii.libraryapp.repository.LibroRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LibroService {
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<Libro> buscarDestacados() {
        return libroRepository.findAll();
    }
}
