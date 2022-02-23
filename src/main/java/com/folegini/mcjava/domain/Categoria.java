package com.folegini.mcjava.domain;

import java.io.Serializable;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Categoria implements Serializable {

    private static final long serialVersionUID = -4362280267044798130L;

    private Integer id;

    private String nome;

    public Categoria(){
    }

    public Categoria(Integer id, String nome){
        this.id = id;
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final Categoria categoria = (Categoria) o;
        return id.equals(categoria.id);
    }

}
