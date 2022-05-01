package br.com.codex.mentoria.model.dto;

import java.util.Set;

public class AtuacaoOut {

    private String regiao;

    private Set<String> estados;

    public AtuacaoOut(String regiao, Set<String> estados) {
        this.regiao = regiao;
        this.estados = estados;
    }

    public String getRegiao() {
        return regiao;
    }

    public Set<String> getEstados() {
        return estados;
    }
}
