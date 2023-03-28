package com.example.msg.msg.cidades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.msg.msg.pais.Pais;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
    Cidade findByIdentifier(String identifier);
}