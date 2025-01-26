package com.dev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dev.backend.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
    // Você pode adicionar consultas personalizadas aqui, se necessário

}
