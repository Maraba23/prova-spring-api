package com.example.msg.msg.cidades;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cidades")
public class CidadeController {

    @Autowired
    private CidadeService msgService;

    @GetMapping
    public List<Cidade> getCidades() {
        return msgService.getCidades();
    }

    @GetMapping("/{id}")
    public Cidade findByIdentifier(@PathVariable String id) {
        return msgService.getCidade(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Cidade salvarCidade(@RequestBody @Valid Cidade cidade) {
        return msgService.salvarCidade(cidade);
    }
}
