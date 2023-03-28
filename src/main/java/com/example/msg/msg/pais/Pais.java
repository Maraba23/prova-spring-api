package com.example.msg.msg.pais;


import com.example.msg.msg.cidades.Cidade;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    @NonNull
    private String nome;

    @Column
    private String identifier;

    @Column
    private long population;

    @JsonIgnore
    @OneToMany(mappedBy = "pais")
    private List<Cidade> cidades;

}

