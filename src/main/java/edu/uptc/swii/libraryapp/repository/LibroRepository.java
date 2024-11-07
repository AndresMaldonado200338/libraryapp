package edu.uptc.swii.libraryapp.repository;

import edu.uptc.swii.libraryapp.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
    
}
