package br.com.codex.mentoria.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@AllArgsConstructor
@Getter
public class AtuacaoOut {

    private String regiao;

    private Set<String> estados;
}
