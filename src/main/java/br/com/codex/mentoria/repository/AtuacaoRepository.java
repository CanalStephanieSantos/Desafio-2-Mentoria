package br.com.codex.mentoria.repository;

import br.com.codex.mentoria.model.Atuacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtuacaoRepository extends JpaRepository<Atuacao, Long> {
}
