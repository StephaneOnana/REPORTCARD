package com.onana.reportcard.controller;


import com.onana.reportcard.model.Eleve;
import com.onana.reportcard.model.Matiere;
import com.onana.reportcard.service.MatiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("matieres")
public class MatiereController {



    @Autowired
    private MatiereService matiereService;


    @GetMapping("/")
    public List<Matiere> getMatieres(){
        return matiereService.getMatieres();
    }

    @GetMapping("/{id}")
    public Optional<Matiere> getMatieres(@PathVariable Long id){
        return matiereService.getMatiere(id);
    }

    @DeleteMapping("/{id}")
    public void deleteMatiere(@PathVariable Long id){
        matiereService.deleteMatiere(id);
    }


    @PostMapping("/")
    public Matiere createMatiere(@RequestBody Matiere matiere){
        return matiereService.createMatiere(matiere);
    }
}
