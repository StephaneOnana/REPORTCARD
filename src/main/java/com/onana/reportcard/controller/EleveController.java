package com.onana.reportcard.controller;


import com.onana.reportcard.model.Eleve;
import com.onana.reportcard.service.EleveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("eleves")
public class EleveController {



    @Autowired
    private EleveService eleveService;


    @GetMapping("/")
    public List<Eleve> getEleves(){
        return eleveService.getEleves();
    }

    @GetMapping("/{id}")
    public Optional<Eleve> getEleve(@PathVariable Long id){
        return eleveService.getEleve(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEleve(@PathVariable Long id){
        eleveService.deleteEleve(id);
    }


    @PutMapping("/{id}")
    public Eleve updateEleve(@PathVariable Long id, @RequestBody Eleve eleve) {
        return eleveService.updateEleve(id, eleve);

    }

    @PostMapping("/")
    public Eleve createEleve(@RequestBody Eleve eleve){
        System.out.println(eleve);
        return eleveService.createEleve(eleve);
    }

}
