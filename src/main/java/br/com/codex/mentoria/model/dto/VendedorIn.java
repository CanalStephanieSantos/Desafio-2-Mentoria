package br.com.codex.mentoria.model.dto;

import br.com.codex.mentoria.model.Vendedor;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Setter
@Getter
public class VendedorIn {

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd/MM/yyyy")
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
