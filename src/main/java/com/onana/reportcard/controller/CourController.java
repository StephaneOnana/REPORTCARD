package com.onana.reportcard.controller;


import com.onana.reportcard.model.Cour;
import com.onana.reportcard.service.CourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cour")
public class CourController {


    @Autowired
    private CourService courService;


    @GetMapping("/")
    public List<Cour> getCours(){
        return courService.getCours();
    }

    @GetMapping("/{id}")
    public Optional<Cour> getCour(@PathVariable Long id){
        return courService.getCour(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCour(@PathVariable Long id){
        courService.deleteCour(id);
    }

    @PutMapping("/{id}")
    public Cour updateCour(@PathVariable Long id, @RequestBody Cour cour) {
        return courService.updateCour(id, cour);
    }

    @PostMapping("/")
    public Cour createCour(@RequestBody Cour cour){
        System.out.println(cour);
        return courService.createCour(cour);
    }




























}
