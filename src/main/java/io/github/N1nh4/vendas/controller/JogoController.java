package io.github.N1nh4.vendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.N1nh4.vendas.model.Jogo;
import io.github.N1nh4.vendas.repository.JogoRepository;

@RestController
@RequestMapping("/api/jogos")
public class JogoController {

    @Autowired
    JogoRepository jogoRepository;
    
    @PostMapping
    public ResponseEntity<Jogo> criarJogo(@RequestBody Jogo jogo) {
        jogo = jogoRepository.save(jogo);
        return ResponseEntity.ok(jogo);
    } 
}
