package com.onana.reportcard.controller;


import com.onana.reportcard.model.Classe;
import com.onana.reportcard.service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("classes")
public class ClasseController {

    @Autowired
    private ClasseService classeService;

    @GetMapping("/")
    public Iterable<Classe> getClasses(){
        return classeService.getClasses();
    }

    @GetMapping("/{id}")
    public Optional<Classe> getClasse(@PathVariable long id){
        return classeService.getClasse(id);
    }

    @DeleteMapping("/{id}")
    public void deleteClasse(@PathVariable Long id){
        classeService.deleteClasse(id);
    }

    @PostMapping("/")
    public Classe createClasse(@RequestBody Classe classe){
        System.out.println(classe);
        return classeService.createClasse(classe);
    }






















}
