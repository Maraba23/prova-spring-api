package com.example.msg.msg.pais;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> getPaises()
    {
        return paisRepository.findAll();
    }

    public Pais findByIdentifier(String id) 
    {
        return paisRepository.findByIdentifier(id);
    }

    public Pais salvarPais(Pais pais) 
    {
        pais.setIdentifier(UUID.randomUUID().toString());
        return paisRepository.save(pais);
    }


}
