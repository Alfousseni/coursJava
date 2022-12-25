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
public class EXO2 {
    
     public static void main(String[] args){
         
         Scanner saisie= new Scanner(System.in);
         
         System.out.println("veuillez entrez le nombre a tester");
         int a= saisie.nextInt();
         
         if(a%3==0 && a%13==0){
             System.out.println("le nombre "+ a +" est divisible pas 3 et 13");
         }
         else{
             System.out.println("ce nombre n'est pas divisible par 3 ET 13");
         }
         
     }
    
}
