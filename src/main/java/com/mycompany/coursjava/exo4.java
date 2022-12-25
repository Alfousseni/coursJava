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
public class exo4 {
     public static void main(String[] args){
         Scanner recup=new Scanner(System.in);
         
         System.out.println("veuillez rentrer la lettre");
         
         String st = recup.nextLine();
         char lettre=st.charAt(0);
         
         if (lettre == 'a' || lettre == 'e' || lettre == 'i' ||  lettre == 'o'
            || lettre == 'u' || lettre == 'A' || lettre == 'E' || lettre == 'I'
            || lettre == 'O' || lettre == 'U'){
            System.out.println("est une voyelle.");}
         else{
            System.out.println("est une consonne.");}
    }
         
         
     
    
}
