package br.com.codex.mentoria.repository;

import br.com.codex.mentoria.model.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
    List<Vendedor> findVendedorById(@Param("id") Long id);
}
