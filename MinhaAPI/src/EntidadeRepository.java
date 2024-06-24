package com.empresa.minhaapi.repository;

import com.empresa.minhaapi.model.Entidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntidadeRepository extends JpaRepository<Entidade, Long> {
}
