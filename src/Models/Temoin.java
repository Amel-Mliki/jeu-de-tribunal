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
public class Temoin implements Personnage
{
    private String credibilite;
     private String  nom ;
    private String prenom ;
    private String adresse ;
    private String relation ;
    private String profession ;
    public Temoin(String nom,String prenom, String adresse,String relation, String profession,
                  String credibilite) 
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse ;
        this.relation = relation;
        this.profession = profession;
        this.credibilite = credibilite;
    } 
    
    public void setCredibilite(String credibilite)
    {
        this.credibilite = credibilite;
    }
        
    public String getCredibilite(){return this.credibilite;}
    
    

    public void mettreAJourCredibilite(String nouvelleCredibilite)
    {
    this.credibilite = nouvelleCredibilite;
    }
    
    public void supprimerTemoin() 
    {
        this.credibilite= null;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.credibilite);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass()!= obj.getClass()) {
            return false;
        }
        final Temoin other = (Temoin) obj;
        if (!Objects.equals(this.credibilite, other.credibilite)) {
            
            return false;
        }
        return Objects.equals(this.credibilite, other.credibilite);
    }
    
}