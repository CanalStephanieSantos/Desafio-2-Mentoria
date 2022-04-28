package br.com.codex.mentoria.model.dto;

import br.com.codex.mentoria.model.Vendedor;

import java.util.Date;
import java.time.LocalDate;

public class VendedorIn {

    private LocalDate dataInclusao;
    private String nome;
    private String telefone;
    private Integer idade;
    private String cidade;
    private String estado;
    private String regiao;

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

    public Vendedor toConvert(){
        return new Vendedor(dataInclusao,nome,telefone,idade,cidade,estado,regiao);
    }

    @Override
    public String toString() {
        return "VendedorIn{" +
                "dataInclusao=" + dataInclusao +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", regiao='" + regiao + '\'' +
                '}';
    }
}
