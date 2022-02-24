package com.folegini.mcjava.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.folegini.mcjava.domain.Categoria;
import com.folegini.mcjava.sevices.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(method= RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){

        Categoria categoria = categoriaService.buscarPorId(id);

        return ResponseEntity.ok().body(categoria);
    }
}
