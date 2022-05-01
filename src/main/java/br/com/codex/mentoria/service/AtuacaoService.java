package br.com.codex.mentoria.service;

import br.com.codex.mentoria.model.Atuacao;
import br.com.codex.mentoria.model.dto.AtuacaoIn;
import br.com.codex.mentoria.repository.AtuacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AtuacaoService {

    @Autowired
    private AtuacaoRepository atuacaoRepository;

    public void salvaAtuacao(AtuacaoIn atuacaoIn) {
        String regiao = atuacaoIn.getRegiao();
        Set<String> estados = atuacaoIn.getEstados();
        Atuacao atuacao = new Atuacao(regiao,estados);
        atuacaoRepository.save(atuacao);
    }
}
