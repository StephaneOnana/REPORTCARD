package com.onana.reportcard.service;


import com.onana.reportcard.model.Classe;
import com.onana.reportcard.repository.ClasseRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class ClasseService {


    @Autowired
    private ClasseRepository classeRepository;


    public Optional<Classe> getClasse(final Long id){
        return classeRepository.findById(id);
    }

    public List<Classe> getClasses(){
        return classeRepository.findAll();
    }

    public void deleteClasse(final Long id){
        classeRepository.deleteById(id);
    }


    public Classe createClasse(Classe newClasse) {
        return classeRepository.save(newClasse);
    }






















}
