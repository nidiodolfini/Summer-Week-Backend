package com.dh.BibliotecaDeFilmes.service;

import com.dh.BibliotecaDeFilmes.model.Filme;
import com.dh.BibliotecaDeFilmes.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;

    public Filme create(Filme filme){
        return repository.save(filme);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    public Filme selectById(Integer id){
        return repository.findById(id).get();
    }

    public List<Filme> selectAll(){
        return repository.findAll();
    }
}
