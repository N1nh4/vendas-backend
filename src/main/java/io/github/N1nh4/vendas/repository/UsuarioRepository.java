package io.github.N1nh4.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.N1nh4.vendas.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    
} 
