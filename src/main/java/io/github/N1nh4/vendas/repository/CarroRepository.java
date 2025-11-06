package io.github.N1nh4.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.N1nh4.vendas.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
    
}
