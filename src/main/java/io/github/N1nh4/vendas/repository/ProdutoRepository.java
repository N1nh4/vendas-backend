package io.github.N1nh4.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.N1nh4.vendas.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
