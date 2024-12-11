/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author MSI
 */
//import java.util.Objects; 
public class Preuve {
   
    public String source ;
    public String fiabilite ; 
    public String type ;
    
    public Preuve(String source ,String fiabilite,String type ){
    this.type=type ; 
    this.source=source ;
    this.fiabilite=fiabilite ;
    }
    
   
   
    public String getType() {
        return type ;
    }
    public void setType (String type) {
        this.type= type;
    }
    public String getSource() {
        return source ;
    }
    public void setSource (String source) {
        this.source= source;
    }
    public String getFiabilite() {
        return fiabilite ;
    }
    public void setFiabilite (String fiabilite) {
        this.fiabilite= fiabilite;
    }
    /*@Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    @Override
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
        final Preuve other = (Preuve)obj ;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.source, other.source)) {
            return false;
        }
        return Objects.equals(this.fiabilite, other.fiabilite);
    }*/
    public void afficherInformations() 
    {
    
    System.out.println("type: " + getType());
    System.out.println("source: " + getSource());
    System.out.println("fiabilite: " + getFiabilite());}
    

    public void mettreAJourSource(String nouvelleSource)
    {
    this.source = nouvelleSource;
    }
    public void supprimerPreuve() 
    {
        this.source = null;
    }
    
    
    
    
    
}