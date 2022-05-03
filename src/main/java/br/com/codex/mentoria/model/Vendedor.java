package br.com.codex.mentoria.model;

//Tabelas e colunas da entidade

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
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

}
