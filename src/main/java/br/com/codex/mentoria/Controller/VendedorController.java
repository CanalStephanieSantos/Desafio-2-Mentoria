package br.com.codex.mentoria.Controller;

import br.com.codex.mentoria.model.dto.VendedorIn;
import br.com.codex.mentoria.service.VendedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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

}
