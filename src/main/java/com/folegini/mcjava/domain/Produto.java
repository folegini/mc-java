package com.folegini.mcjava.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = -1154218469014111561L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private Double preco;

    @JsonBackReference
    @ManyToMany
    @JoinTable(name="produtoCategoria",
        joinColumns = @JoinColumn(name="produto_id"),
        inverseJoinColumns = @JoinColumn(name="categoria_id")
    )
    private List<Categoria> categorias = new ArrayList<>();

    public Produto(){

    }

    public Produto(Integer id, String nome, Double preco){
        this.setId(id);
        this.setNome(nome);
        this.setPreco(preco);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final Produto produto = (Produto) o;
        return id.equals(produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
