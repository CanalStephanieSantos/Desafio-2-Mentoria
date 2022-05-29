package br.com.codex.mentoria.service;

import br.com.codex.mentoria.model.Atuacao;
import br.com.codex.mentoria.model.dto.AtuacaoIn;
import br.com.codex.mentoria.repository.AtuacaoRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AtuacaoService {

    private final AtuacaoRepository atuacaoRepository;
    private final ModelMapper modelMapper;

    public void salvaAtuacao(AtuacaoIn atuacaoIn) {
        Atuacao atuacao = modelMapper.map(atuacaoIn, Atuacao.class);
        atuacaoRepository.save(atuacao);
    }
}
