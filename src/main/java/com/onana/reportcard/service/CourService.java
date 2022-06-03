package com.onana.reportcard.service;


import com.onana.reportcard.model.Cour;
import com.onana.reportcard.repository.CourRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class CourService {

    @Autowired
    private CourRepository courRepository;


    public Optional<Cour> getCour(final Long id){
        return courRepository.findById(id);
    }

    public List<Cour> getCours(){
        return courRepository.findAll();
    }

    public void deleteCour(final Long id){
        courRepository.deleteById(id);
    }

    public Cour createCour(Cour cour){
        return courRepository.save(cour);
    }

    public Cour updateCour(Long id, Cour newCour){

        Cour cour = this.getCour(id).orElseThrow(()-> new IllegalArgumentException("Illegal ID"));
        if(newCour.getClasse() != null)
            cour.setClasse(newCour.getClasse());
        if(newCour.getMatiere() != null)
            cour.setMatiere(newCour.getMatiere());
        if(newCour.getProfesseur() != null)
            cour.setProfesseur(newCour.getProfesseur());
        if(newCour.getCode() != null)
            cour.setCode(newCour.getCode());
        if(newCour.getCoefficient() != 0)
            cour.setCoefficient(newCour.getCoefficient());

        return courRepository.save(cour);


    }






























}
