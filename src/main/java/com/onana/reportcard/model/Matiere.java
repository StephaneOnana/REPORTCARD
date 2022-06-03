package com.onana.reportcard.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String intitule;

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Matiere(){}

    public Matiere(String intitule){
        this.intitule = intitule;
    }

}
