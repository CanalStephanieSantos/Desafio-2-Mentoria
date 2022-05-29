package br.com.codex.mentoria.model.dto;

import com.sun.istack.NotNull;
import lombok.Getter;

import java.util.Set;

@Getter
public class AtuacaoIn {

    @NotNull
    private String regiao;

    @NotNull
    private Set<String> estados;
}
