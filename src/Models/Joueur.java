/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author MSI
 */
import java.util.Objects;

public class Joueur implements Personnage
{
    private int annee_experience;
    private String affaire_en_cours ;
    private String  nom ;
    private String prenom ;
    private String adresse ;
    private String relation ;
    private String profession ;
    public Joueur(String nom,String prenom, String adresse, String relation, String profession,
                  String affaire_en_cours, int annee_experience ) 
    {
       this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse ;
        this.relation = relation;
        this.profession = profession;
        this.annee_experience =annee_experience;
        this.affaire_en_cours = affaire_en_cours;
        
    } 

    public void setAnneeExperience(int annee_experience)
    {
        this.annee_experience = annee_experience;
    }
    public void setAffaireEnCours(String affaire_en_cours)
    {
        this.affaire_en_cours = affaire_en_cours;
    }
    
    public int getAnneeExperience(){return this.annee_experience;}
    
    public String getAffaireEnCours(){return this.affaire_en_cours;}
    
    

    public void mettreAJourAffaire(String nouvelleAffaire)
    {
    this.affaire_en_cours = nouvelleAffaire;
    }

    public void mettreAJourAnnee(int nouvelleAnnee)
    {
    this.annee_experience = nouvelleAnnee;
    }
    
    public void supprimerJoueur() 
    {
        this.affaire_en_cours = null;
    }
    public int hashCode() {
        int hash = 7;
  
        hash = 83 * hash + this.annee_experience;
        hash = 83 * hash + Objects.hashCode(this.affaire_en_cours);
        return hash;
    }
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Joueur other = (Joueur) obj;
        if (!Objects.equals(this.annee_experience, other.annee_experience)) {
            return false;
        }
        return Objects.equals(this.affaire_en_cours, other.affaire_en_cours);
        
    }

    public String getNom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getAdresse() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getRelation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

   

    /*private Class< extends Object> Joueurs() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
}