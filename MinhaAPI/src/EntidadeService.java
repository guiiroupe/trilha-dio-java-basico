package com.empresa.minhaapi.service;

import com.empresa.minhaapi.model.Entidade;
import com.empresa.minhaapi.repository.EntidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadeService {

    @Autowired
    private EntidadeRepository entidadeRepository;

    public List<Entidade> listarEntidades() {
        return entidadeRepository.findAll();
    }

    // outros métodos de serviço
}

