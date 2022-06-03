package com.onana.reportcard.controller;


import com.onana.reportcard.model.Eleve;
import com.onana.reportcard.model.Professeur;
import com.onana.reportcard.service.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("professeurs")
public class ProfesseurController {

    @Autowired
    private ProfesseurService professeurService;

    @GetMapping("/")
    public List<Professeur> getProfesseurs(){
        return professeurService.getProfesseurs();
    }

    @GetMapping("/{id}")
    public Optional<Professeur> getProfesseur(@PathVariable Long id){
        return professeurService.getProfesseur(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProfesseur(@PathVariable Long id){
        professeurService.deleteProfesseur(id);
    }

    @PutMapping("/{id}")
    public Professeur updateProfesseur(@PathVariable Long id, @RequestBody Professeur professeur){
        return professeurService.updateProfesseur(id, professeur);

    }

    @PostMapping("/")
    public Professeur createProfesseur(@RequestBody Professeur professeur){
        return professeurService.createProfesseur(professeur);
    }

}
