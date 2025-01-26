package com.dev.backend.services;

import java.util.List;
import java.sql.Timestamp; // Alterando para Timestamp
import java.util.Date; // Classe para pegar a data e hora atual

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backend.entity.Estado;
import com.dev.backend.repository.EstadoRepository;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> buscarTodos() {
        return estadoRepository.findAll();
    }

    public Estado inserir(Estado estado) {
        // Usando Timestamp em vez de java.sql.Date
        estado.setDataCriacao(new Timestamp(System.currentTimeMillis())); // Criação com hora
        Estado estadoNovo = estadoRepository.saveAndFlush(estado);
        return estadoNovo;
    }

    public Estado alterar(Estado estado) {
        // Usando Timestamp em vez de java.sql.Date
        estado.setDataAtualizacao(new Timestamp(System.currentTimeMillis())); // Atualização com hora
        return estadoRepository.saveAndFlush(estado);
    }

    public void excluir(Long id) {
        Estado estado = estadoRepository.findById(id).get();
        estadoRepository.delete(estado);
    }
}
