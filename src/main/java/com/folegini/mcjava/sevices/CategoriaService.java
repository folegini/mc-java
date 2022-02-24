package com.folegini.mcjava.sevices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.folegini.mcjava.domain.Categoria;
import com.folegini.mcjava.repositories.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Optional<Categoria> buscarPorId(Integer id){

        Optional<Categoria> categoria = categoriaRepository.buscarById(id);

        return categoria;
    }
}
