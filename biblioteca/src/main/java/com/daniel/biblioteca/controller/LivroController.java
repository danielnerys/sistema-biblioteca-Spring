package com.daniel.biblioteca.controller;

import com.daniel.biblioteca.model.Livro;
import com.daniel.biblioteca.model.Usuario;
import com.daniel.biblioteca.repository.LivroRepository;
import com.daniel.biblioteca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Livro> buscarPorId(@PathVariable Long id) {
        return livroRepository.findById(id);
    }

    @PostMapping
    public Livro cadastrarLivro(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }

    @DeleteMapping("/{id}")
    public void deletarLivro(@PathVariable Long id) {
        livroRepository.deleteById(id);
    }

    @PutMapping("/{idLivro}/usuario/{idUsuario}")
    public Livro alugar(@PathVariable Long idLivro, @PathVariable Long idUsuario){
        Optional<Livro> livro = livroRepository.findById(idLivro);
        Optional<Usuario> usuario = usuarioRepository.findById(idUsuario);
        if(livro.isPresent() && usuario.isPresent()){
            livro.get().setUsuario(usuario.get());
            livroRepository.save(livro.get());
            return livro.get();
        }
        return null;
    }

    @GetMapping("/usuario/{idUsuario}")
    public List<Livro> listarLivrosPorUsuario(@PathVariable Long idUsuario){
        return livroRepository.findByUsuarioIdUsuario(idUsuario);
    }


}




