package com.onana.reportcard.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Eleve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String matricule;

    @JsonIgnore
    @ManyToOne
    private Classe classe;

    private String nom;

    private String prenom;

    private Date dateDeNaiss;

    private String lieuDeNaiss;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateDeNaiss() {
        return dateDeNaiss;
    }

    public void setDateDeNaiss(Date dateDeNaiss) {
        this.dateDeNaiss = dateDeNaiss;
    }

    public String getLieuDeNaiss() {
        return lieuDeNaiss;
    }

    public void setLieuDeNaiss(String lieuDeNaiss) {
        this.lieuDeNaiss = lieuDeNaiss;
    }

    public Eleve(){}

    public Eleve(String nom, String prenom, Date date, String lieu, String matricule) {

        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaiss = date;
        this.lieuDeNaiss = lieu;
    }



}
