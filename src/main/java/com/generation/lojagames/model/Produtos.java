package com.generation.lojagames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.text.DecimalFormat;

@Entity
@Table(name = "tb_produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório!")
    private String nome;

    private String descriao;

    @NotBlank(message = "O console é obrigatória!")
    @Size(min = 3, message = "O console deve ter no mínimo três caracteres")
    private String console;

    @NotBlank(message = "A quantidade é obrigatória!")
    private int quantidade;

    @NotBlank(message = "O preço é obrigatório!")
    private DecimalFormat preco;

    private String foto;

    @ManyToOne
    @JsonIgnoreProperties("produtos")
    private Categorias categorias;

    @ManyToOne
    @JsonIgnoreProperties("produtos")
    private Usuarios usuarios;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescriao() {
        return descriao;
    }

    public void setDescriao(String descriao) {
        this.descriao = descriao;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public DecimalFormat getPreco() {
        return preco;
    }

    public void setPreco(DecimalFormat preco) {
        this.preco = preco;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Categorias getCategorias() {
        return categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}
