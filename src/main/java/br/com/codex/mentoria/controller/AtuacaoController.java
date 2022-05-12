package br.com.codex.mentoria.controller;

import br.com.codex.mentoria.model.dto.AtuacaoIn;
import br.com.codex.mentoria.service.AtuacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
public class AtuacaoController {

    private final AtuacaoService atuacaoService;

    @PostMapping("/atuacao")
    public ResponseEntity salvaAtuacao(@RequestBody AtuacaoIn atuacaoIn) {
        atuacaoService.salvaAtuacao(atuacaoIn);
        return ResponseEntity.status(CREATED).build();
    }
}
