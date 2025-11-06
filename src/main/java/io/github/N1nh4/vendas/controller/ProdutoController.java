package io.github.N1nh4.vendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.N1nh4.vendas.model.Produto;
import io.github.N1nh4.vendas.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin("*")
public class ProdutoController {
    
    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping()
    public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
        produto = produtoRepository.save(produto);
        System.out.println(produto);
        return ResponseEntity.ok(produto);
    }

    @GetMapping()
    public List<Produto> visualizarProdutos() {
        return produtoRepository.findAll();
    }
}
