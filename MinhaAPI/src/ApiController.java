package com.empresa.minhaapi.controller;

import com.empresa.minhaapi.model.Entidade;
import com.empresa.minhaapi.service.EntidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entidades")
public class ApiController {

    @Autowired
    private EntidadeService entidadeService;

    @GetMapping
    public List<Entidade> listarEntidades() {
        return entidadeService.listarEntidades();
    }

    // outros endpoints REST para criar, atualizar, deletar entidades, etc.
}
