package com.example.msg.msg.pais;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paises")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping
    public List<Pais> getPaises() 
    {
        return paisService.getPaises();
    }

    @GetMapping("/{id}")
    public Pais findByIdentifier(@PathVariable String id) 
    {
        return paisService.findByIdentifier(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Pais salvarPais(@RequestBody @Valid Pais pais) 
    {
        return paisService.salvarPais(pais);
    }

}
