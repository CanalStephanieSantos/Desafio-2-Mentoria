package br.com.codex.mentoria.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "atuacao")
public class Atuacao {

    @Id
    @Column(name = "id_atuacao", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAtuacao;

    private String regiao;

    @ElementCollection
    @CollectionTable(name = "atuacao_estados", joinColumns = @JoinColumn(name = "id_atuacao"))
    private Set<String> estados = new HashSet<>();

    /* Descomentar aqui quando houver a classe Vendedor e criar o getter e settes
    @ManyToOne
    @JoinColumn(name = "idVendedor", nullable = false)
    private Vendedor vendedor;
    */

    public Atuacao() {
    }

    public Atuacao(String regiao, Set<String> estados){
        this.regiao = regiao;
        this.estados = estados;
    }

    public Long getIdAtuacao() {
        return idAtuacao;
    }

    public String getRegiao() {
        return regiao;
    }

    public Set<String> getEstados() {
        return estados;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void setEstados(Set<String> estados) {
        this.estados = estados;
    }
}
