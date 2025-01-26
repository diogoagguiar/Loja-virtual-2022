package com.dev.backend.entity;

import java.sql.Timestamp; // Alterando para Timestamp
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "estado")
@Data
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
    private String sigla;

    // Usando Timestamp para incluir hora
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataCriacao; // Alterado para Timestamp

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp dataAtualizacao; // Alterado para Timestamp
}
