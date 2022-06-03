package br.com.codex.mentoria.model.dto;

import br.com.codex.mentoria.model.Vendedor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VendedorOut {

    private String nome;
    private LocalDate dataInclusao;
    private String estado;

    public static VendedorOut convert(Vendedor vendedor){
        VendedorOut vendedorOut = new VendedorOut();
        vendedorOut.setNome(vendedor.getNome());
        vendedorOut.setDataInclusao(vendedor.getDataInclusao());
        vendedorOut.setEstado(vendedor.getEstado());
        return vendedorOut;
    }

}
