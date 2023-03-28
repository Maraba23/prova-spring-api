package com.example.msg.msg.cidades;

import com.example.msg.msg.pais.Pais;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column
    @NotNull
    @NonNull
    protected String nome;

    @Column
    protected String identifier;

    @Column
    public String mayor;

    @ManyToOne
    @JoinColumn(name="id_pais")
    public Pais pais;

}
