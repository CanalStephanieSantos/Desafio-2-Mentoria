package br.com.codex.mentoria.model;

//Tabelas e colunas da entidade

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class Vendedor {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate dataInclusao;
    private String nome;
    private String telefone;
    private Integer idade;
    private String cidade;
    private String estado;
    private String regiao;


    public Vendedor(LocalDate dataInclusao, String nome, String telefone, Integer idade, String cidade, String estado, String regiao) {
        this.dataInclusao = dataInclusao;
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.cidade = cidade;
        this.estado = estado;
        this.regiao = regiao;
    }

    public LocalDate getDataInclusao() {
        return dataInclusao;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getRegiao() {
        return regiao;
    }

}
