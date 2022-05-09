package br.com.codex.mentoria.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "atuacao")
public class Atuacao {

    @Id
    @Column(name = "id_atuacao", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAtuacao;

    @NotNull
    private String regiao;

    @ElementCollection
    @CollectionTable(name = "atuacao_estados", joinColumns = @JoinColumn(name = "id_atuacao"))
    @NotNull
    private Set<String> estados = new HashSet<>();

    /* Descomentar aqui quando houver a classe Vendedor e criar o getter e settes
    @ManyToOne
    @JoinColumn(name = "idVendedor", nullable = false)
    private Vendedor vendedor;
    */
}
