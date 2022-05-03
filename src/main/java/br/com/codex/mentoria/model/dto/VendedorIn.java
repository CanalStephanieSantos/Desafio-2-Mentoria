package br.com.codex.mentoria.model.dto;

import br.com.codex.mentoria.model.Vendedor;
import lombok.Getter;

import java.util.Date;
import java.time.LocalDate;

@Getter
public class VendedorIn {

    private LocalDate dataInclusao;
    private String nome;
    private String telefone;
    private Integer idade;
    private String cidade;
    private String estado;
    private String regiao;


    public Vendedor toConvert(){
        return new Vendedor(null, dataInclusao,nome,telefone,idade,cidade,estado,regiao);
    }

}
