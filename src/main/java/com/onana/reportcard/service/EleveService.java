package com.onana.reportcard.service;


import com.onana.reportcard.model.Cour;
import com.onana.reportcard.model.Eleve;
import com.onana.reportcard.repository.EleveRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class EleveService {


    @Autowired
    private EleveRepository eleveRepository;


    public Optional<Eleve> getEleve(final long id){
        return eleveRepository.findById(id);
    }

    public List<Eleve> getEleves(){
        return eleveRepository.findAll();
    }

    public void deleteEleve(final long id){
        eleveRepository.deleteById(id);
    }

    public Eleve createEleve(Eleve eleve){
        return eleveRepository.save(eleve);
    }

    public Eleve updateEleve(Long id, Eleve newEleve){

        Eleve eleve = this.getEleve(id).orElseThrow(()-> new IllegalArgumentException("Illégal ID"));
        if(newEleve.getNom() != null)
            eleve.setNom(newEleve.getNom());
        if(newEleve.getPrenom() != null)
            eleve.setPrenom(newEleve.getPrenom());
        if(newEleve.getDateDeNaiss() != null)
            eleve.setDateDeNaiss(newEleve.getDateDeNaiss());
        if(newEleve.getLieuDeNaiss() != null)
            eleve.setLieuDeNaiss(newEleve.getLieuDeNaiss());
        if(newEleve.getMatricule() != null)
            eleve.setMatricule(newEleve.getMatricule());
        if(newEleve.getClasse() != null)
            eleve.setClasse(newEleve.getClasse());

        return eleveRepository.save(eleve);
    }



























}
