package br.com.codex.mentoria.Controller;

import br.com.codex.mentoria.model.Vendedor;
import br.com.codex.mentoria.model.dto.VendedorIn;
import br.com.codex.mentoria.repository.VendedorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RequiredArgsConstructor
@RestController
public class VendedorController {

    private final VendedorRepository vendedorRepository;


    @PostMapping(value = "/vendedor")
    public ResponseEntity salvarVendedor(@RequestBody VendedorIn vendedorIn){
        Vendedor vendedor = vendedorIn.toConvert();
        vendedorRepository.save(vendedor);

        return ResponseEntity.status(Objects.requireNonNull(HttpStatus.CREATED)).build();
    }

}
