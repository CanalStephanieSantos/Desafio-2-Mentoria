package br.com.codex.mentoria.service;

import br.com.codex.mentoria.model.Vendedor;
import br.com.codex.mentoria.model.dto.VendedorIn;
import br.com.codex.mentoria.model.dto.VendedorOut;
import br.com.codex.mentoria.repository.VendedorRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class VendedorService {

    private final VendedorRepository vendedorRepository;
    private final ModelMapper modelMapper;

    public void salvaVendedor(VendedorIn vendedorIn) {
        Vendedor vendedor = modelMapper.map(vendedorIn, Vendedor.class);
        vendedorRepository.save(vendedor);
    }

    public List<VendedorOut> vendedorById(Long id){
        List<Vendedor> vendedor = vendedorRepository.findVendedorById(id);
        List<VendedorOut> list = new ArrayList<>();

            vendedor.forEach(vendedor1 -> {
                VendedorOut out = new VendedorOut();
                out.setNome(vendedor1.getNome());
                out.setDataInclusao(vendedor1.getDataInclusao());
                out.setEstado(vendedor1.getEstado());
                list.add(out);
            });

        return list;

    }

    Vendedor vendedor;
    public List<Vendedor> findAll(){
        return vendedorRepository.findAll();
    }

}
