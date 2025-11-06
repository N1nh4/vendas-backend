package io.github.N1nh4.vendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.N1nh4.vendas.model.Usuario;
import io.github.N1nh4.vendas.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {
        usuario = usuarioRepository.save(usuario);
        System.out.println(usuario);
        return ResponseEntity.ok(usuario);
    }
}
