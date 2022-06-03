package com.onana.reportcard.service;


import com.onana.reportcard.model.Matiere;
import com.onana.reportcard.repository.MatiereRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class MatiereService {


    @Autowired
    private MatiereRepository matiereRepository;

    public Optional<Matiere> getMatiere(Long id){
        return matiereRepository.findById(id);
    }

    public List<Matiere> getMatieres(){
        return matiereRepository.findAll();
    }

    public void deleteMatiere(final Long id){
        matiereRepository.deleteById(id);
    }

    public Matiere createMatiere(Matiere matiere){
        return matiereRepository.save(matiere);
    }

}
