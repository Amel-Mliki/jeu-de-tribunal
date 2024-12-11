/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

    

import java.util.Objects; 
public record Coupable(String details_judiciaires ,String nom , String prenom ,String adresse , String profession,String relation, Preuve preuve  ) implements Personnage
{
    
}
  