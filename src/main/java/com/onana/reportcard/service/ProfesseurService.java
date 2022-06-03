package com.onana.reportcard.service;


import com.onana.reportcard.model.Matiere;
import com.onana.reportcard.model.Professeur;
import com.onana.reportcard.repository.ProfesseurRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class ProfesseurService {


    @Autowired
    private ProfesseurRepository professeurRepository;


    public Optional<Professeur> getProfesseur(Long id){
        return professeurRepository.findById(id);
    }

    public List<Professeur> getProfesseurs(){
        return professeurRepository.findAll();
    }

    public void deleteProfesseur(Long id){
        professeurRepository.deleteById(id);
    }

    public Professeur createProfesseur(Professeur professeur){
        return  professeurRepository.save(professeur);
    }

    public Professeur updateProfesseur(Long id, Professeur professeur){

        Professeur prof = this.getProfesseur(id).orElseThrow(()-> new IllegalArgumentException("Illegal ID"));

        if(professeur.getNom() != null)
            prof.setNom(professeur.getNom());
        if(professeur.getPrenom() != null)
            prof.setPrenom(professeur.getPrenom());
        if(professeur.getEmail() != null)
            prof.setEmail(professeur.getEmail());
        if(professeur.getGrade() != null)
            prof.setGrade(professeur.getGrade());
        if(professeur.getMatricule() != null)
            prof.setMatricule(professeur.getMatricule());


        return professeurRepository.save(prof);

    }

}
