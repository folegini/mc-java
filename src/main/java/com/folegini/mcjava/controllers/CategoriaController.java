package com.folegini.mcjava.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.folegini.mcjava.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @RequestMapping(method= RequestMethod.GET)
    public List<Categoria> listar(){

        Categoria cat1 = new Categoria(1,"Informatica");
        Categoria cat2 = new Categoria(2, "Escritorio");

        List<Categoria> categorias = new ArrayList<>();

        categorias.add(cat1);
        categorias.add(cat2);

        return categorias;
    }
}
