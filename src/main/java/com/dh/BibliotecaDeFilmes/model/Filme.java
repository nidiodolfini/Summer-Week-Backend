package com.dh.BibliotecaDeFilmes.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String urlImg;
    private String titulo;
    private String descricao;

}
