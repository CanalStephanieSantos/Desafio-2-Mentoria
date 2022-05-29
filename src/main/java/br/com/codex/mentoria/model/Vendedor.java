package br.com.codex.mentoria.model;

//Tabelas e colunas da entidade

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Vendedor {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private LocalDate dataInclusao;

    @NotNull
    private String nome;

    @NotNull
    private String telefone;

    @NotNull
    private Integer idade;

    @NotNull
    private String cidade;

    @NotNull
    private String estado;

    @NotNull
    private String regiao;


}
