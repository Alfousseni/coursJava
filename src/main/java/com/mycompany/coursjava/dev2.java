/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coursjava;

import java.util.Scanner;

/**
 *
 * @author Alfousseni
 */
public class dev2 {
    public static void main(String[] args){
         
         Scanner saisie= new Scanner(System.in);
         
         int nombre=0;
         int somme=0,cpt=0;
      
      do{
          System.out.println("veuillez entrez le nombre entier positive");
           nombre = saisie.nextInt();
          
      } while(nombre<=0);   
         
         System.out.println("les nombre entier compris entre "+ nombre + " et 1 sont:");
         
     for (int i = nombre; i <= nombre; i--){

         System.out.println("les nombre entier compris entre "+ nombre + " et 1 sont:");
    }

}
    
}
