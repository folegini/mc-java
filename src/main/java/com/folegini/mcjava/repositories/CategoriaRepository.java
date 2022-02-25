package com.folegini.mcjava.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.folegini.mcjava.domain.Categoria;
import com.folegini.mcjava.exceptions.ObjectNotFoundException;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    public default Optional<Categoria> buscarById(Integer id){
        return Optional.ofNullable(this.findById(id).orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrato!")));
    }

}
