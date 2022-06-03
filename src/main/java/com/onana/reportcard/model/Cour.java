package com.onana.reportcard.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class Cour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    @JsonIgnore
    @ManyToOne
    private Classe classe;

    @JsonIgnore
    @ManyToOne
    private Matiere matiere;

    @JsonIgnore
    @ManyToOne
    private Professeur professeur;

    private int coefficient;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cour (){}

    public Cour (String code, Classe classe, Matiere matiere, Professeur professeur, int coefficient){

        this.code = code;
        this.classe = classe;
        this.matiere = matiere;
        this.professeur = professeur;
        this.coefficient = coefficient;
    }
}
