package io.github.N1nh4.vendas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.N1nh4.vendas.model.Produto;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    
    @PostMapping()
    public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
        System.out.println(produto.getNome());
        return ResponseEntity.ok(produto);
    }
}
