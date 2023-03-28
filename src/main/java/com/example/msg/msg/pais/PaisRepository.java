package com.example.msg.msg.pais;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {
    Pais findByIdentifier(String identifier);
}
