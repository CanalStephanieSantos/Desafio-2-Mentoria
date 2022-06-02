package br.com.codex.mentoria.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VendedorOut {

    private String nome;
    private LocalDate dataInclusao;
    private String estado;

}
