package com.daniel.biblioteca.repository;

import com.daniel.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    List<Livro> findByUsuarioIdUsuario(Long idUsuario);
}
