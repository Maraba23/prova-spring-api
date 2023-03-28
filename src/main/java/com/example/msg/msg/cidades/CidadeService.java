package com.example.msg.msg.cidades;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msg.msg.pais.Pais;
import com.example.msg.msg.pais.PaisService;

import java.util.List;
import java.util.UUID;

@Service
public class CidadeService {

    @Autowired
    private PaisService paisService;

    @Autowired
    private CidadeRepository cidadeRepository;

    public Cidade getCidade(String id) {
        return cidadeRepository.findByIdentifier(id);
    }

    public List<Cidade> getCidades() {
        return cidadeRepository.findAll();
    }

    public Cidade salvarCidade(Cidade cidade) {
        Pais pais = paisService.findByIdentifier(cidade.getPais().getIdentifier());
        cidade.setPais(pais);
        cidade.setIdentifier(UUID.randomUUID().toString());
        return cidadeRepository.save(cidade);
    }

}
