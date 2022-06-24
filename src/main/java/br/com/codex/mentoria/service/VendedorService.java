package br.com.codex.mentoria.service;

import br.com.codex.mentoria.model.Vendedor;
import br.com.codex.mentoria.model.dto.VendedorIn;
import br.com.codex.mentoria.model.dto.VendedorOut;
import br.com.codex.mentoria.repository.VendedorRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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

    public List<Vendedor> findAll(){
        return vendedorRepository.findAll();
    }

    public VendedorOut vendedorById(Long id){
        Vendedor vendedor = vendedorRepository.findById(id).get();
        return VendedorOut.convert(vendedor);
    }
}
