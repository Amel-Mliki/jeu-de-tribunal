/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author MSI
 */
import java.util.Date;
import java.util.Objects;
public class Crime 
{
    private String description;
    private Date date;
    private String lieu;
    public Crime(String description,Date date,String lieu)
    {
      this.description=description;
      this.date=date;
      this.lieu=lieu; 
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public void setDate(Date date)
    {
        this.date = date;
    }
    public void setLieu(String lieu)
    {
        this.lieu = lieu;
    }
    public String getDescription(){return this.description;}
    public Date getDate(){return this.date;}
    public String getLieu(){return this.lieu;}
    
    public void afficherInformations() 
    {
    System.out.println("Description: " + description);
    System.out.println("Date: " + date);
    System.out.println("Lieu: " + lieu);
    }

    public void mettreAJourDecription(String nouvelleDescription)
    {
    this.description = nouvelleDescription;
    }

    public void mettreAJourDate(Date nouvelleDate)
    {
    this.date = nouvelleDate;
    }
    public void mettreAJourLieu(String nouveauLieu)
    {
    this.lieu = nouveauLieu;
    }
    
    public void supprimerCrime() 
    {
        this.description = null;
    }
    @Override
    public int hashCode() {
        int hash = 7;
  
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + Objects.hashCode(this.lieu);
        hash = 47 * hash + Objects.hashCode(this.date);
        
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Crime other = (Crime) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.date,other.date)) {
            return false;
        }
        return Objects.equals(this.lieu, other.lieu);
    }   
    
}