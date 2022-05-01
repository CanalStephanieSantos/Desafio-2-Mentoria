package br.com.codex.mentoria.controller;

import br.com.codex.mentoria.model.dto.AtuacaoIn;
import br.com.codex.mentoria.service.AtuacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class AtuacaoController {

    @Autowired
    private AtuacaoService atuacaoService;

    @PostMapping("/atuacao")
    public ResponseEntity salvaAtuacao(@RequestBody AtuacaoIn atuacaoIn) {
        atuacaoService.salvaAtuacao(atuacaoIn);
        return ResponseEntity.status(CREATED).build();
    }
}
