package br.com.codex.mentoria.model.dto;

import java.util.Set;

public class AtuacaoIn {

    private String regiao;

    private Set<String> estados;

    public String getRegiao() {
        return regiao;
    }

    public Set<String> getEstados() {
        return estados;
    }
}
