package io.github.N1nh4.vendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.N1nh4.vendas.model.Carro;
import io.github.N1nh4.vendas.repository.CarroRepository;

@RestController
@RequestMapping("/api/carros")
public class CarroController {
    
    @Autowired
    CarroRepository carroRepository;
    
    @PostMapping
    public ResponseEntity<Carro> criarCarro(@RequestBody Carro carro) {
        carro = carroRepository.save(carro);
        return ResponseEntity.ok(carro);
    }
}
