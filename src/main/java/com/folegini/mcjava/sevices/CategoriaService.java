package com.folegini.mcjava.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.folegini.mcjava.domain.Categoria;
import com.folegini.mcjava.repositories.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscarPorId(Integer id){

        Categoria categoria = categoriaRepository.getById(id);

        return categoria;
    }
}
