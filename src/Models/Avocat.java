/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author MSI
 */

import java.util.ArrayList;
import java.util.Objects; 
public class Avocat implements Personnage {
    private String  specialite ;
    private String affaire_en_cours ;
    private String Client ;
     private String  nom ;
    private String prenom ;
    private String adresse ;
    private String relation ;
    private String profession ;
    private ArrayList <Preuve> preuves;
    //for each: for(Preuve elt:preuves)!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public Avocat(String specialite ,String affaire_en_cours ,String Client  ,String nom , String prenom ,String adresse , String profession,String relation,Preuve preuve ){
            
    this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse ;
        this.relation = relation;
        this.profession = profession;
    this.specialite=specialite ;
    this.affaire_en_cours=affaire_en_cours ;
    this.Client= Client;
    preuves= new ArrayList();
    }
    public String getspecialite() {
        return specialite ;
    }
    public void setspecialite (String specialite) {
        this.specialite = specialite;
    }
    public String getaffaire_en_cours() {
        return affaire_en_cours ;
    }
    public void setaffaire_en_cours (String affaire_en_cours) {
        this.affaire_en_cours = affaire_en_cours;
    }
    public String getClient() {
        return Client ;
    }
    public void setClient(String Client) {
        this.Client = Client;
    }
    @Override
    public int hashCode() {
        int hash = 7;
  
        
        hash = 83 * hash + Objects.hashCode(this.Client);
        hash = 83 * hash + Objects.hashCode(this.affaire_en_cours);
        hash = 83 * hash + Objects.hashCode(this.specialite);
        
        return hash;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Avocat other = (Avocat)obj ;
        if (!Objects.equals(this.specialite, other.specialite)) {
            return false;
        }
        if (!Objects.equals(this.affaire_en_cours, other.affaire_en_cours)) {
            return false;
        }
        return Objects.equals(this.Client, other.Client);
    }
    

    public void mettreAJourAffaire(String nouvelleAffaire)
    {
    this.affaire_en_cours = nouvelleAffaire;
    }
    public void mettreAJourClient(String nouveauClient)
    {
    this.Client = nouveauClient;
    }

    
    
    public void supprimerAvocat() 
    {
        this.affaire_en_cours = null;
    }

   
    /*private Class< extends Object> Avocats() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPrenom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getAdresse() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getRelation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getProfession() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
}