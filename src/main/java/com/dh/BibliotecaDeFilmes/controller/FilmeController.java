package com.dh.BibliotecaDeFilmes.controller;

import com.dh.BibliotecaDeFilmes.model.Filme;
import com.dh.BibliotecaDeFilmes.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filme")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FilmeController {

    @Autowired
    private FilmeService service;

    @PostMapping
    public Filme post(@RequestBody Filme filme){
        return service.create(filme);
    }

    @PutMapping
    public Filme put(@RequestBody Filme filme){
        return service.create(filme);
    }

    @DeleteMapping("/{id}")
    public String post(@PathVariable Integer id){
        service.delete(id);
        return "Filme deletado com sucesso";
    }

    @GetMapping("/{id}")
    public Filme selectById(@PathVariable Integer id){
        return service.selectById(id);
    }

    @GetMapping
    public List<Filme> selectAll(){
        return service.selectAll();
    }
}