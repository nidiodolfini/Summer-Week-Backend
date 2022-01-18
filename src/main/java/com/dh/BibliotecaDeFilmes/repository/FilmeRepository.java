package com.dh.BibliotecaDeFilmes.repository;

import com.dh.BibliotecaDeFilmes.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {
}
