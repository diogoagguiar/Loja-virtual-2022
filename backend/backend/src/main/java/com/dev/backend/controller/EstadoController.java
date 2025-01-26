package com.dev.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.backend.entity.Estado;
import com.dev.backend.services.EstadoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable; // Importando o PathVariable

@RestController
@RequestMapping("/api/estado")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    // Endpoint para buscar todos os estados
    @GetMapping("/")
    public List<Estado> buscarTodos() {
        return estadoService.buscarTodos();
    }

    // Endpoint para inserir um novo estado
    @PostMapping("/")
    public Estado inserir(@RequestBody Estado estado) { // Adicionando @RequestBody
        return estadoService.inserir(estado);
    }

    // Endpoint para alterar um estado
    @PutMapping("/alterar") // Usando /alterar para diferenciação
    public Estado alterar(@RequestBody Estado estado) { // Adicionando @RequestBody
        return estadoService.alterar(estado);
    }

    // Endpoint para excluir um estado
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) { // Alterado para @PathVariable
        estadoService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
