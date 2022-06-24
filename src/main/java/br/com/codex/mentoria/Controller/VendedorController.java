package br.com.codex.mentoria.Controller;

import br.com.codex.mentoria.model.Vendedor;
import br.com.codex.mentoria.model.dto.VendedorIn;
import br.com.codex.mentoria.model.dto.VendedorOut;
import br.com.codex.mentoria.service.VendedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RequiredArgsConstructor
@RestController
public class VendedorController {

    private final VendedorService vendedorService;

    @PostMapping(value = "/vendedor")
    public ResponseEntity salvarVendedor(@Valid @RequestBody VendedorIn vendedorIn){
        vendedorService.salvaVendedor(vendedorIn);
        return ResponseEntity.status(CREATED).build();
    }

    @GetMapping(value = "/vendedor/all")
    public List<Vendedor> findAll(){
        return vendedorService.findAll();
    }

    @GetMapping(value = "/vendedor/{id}")
    public VendedorOut vendedorById(@PathVariable Long id){
        return vendedorService.vendedorById(id);
    }

}
