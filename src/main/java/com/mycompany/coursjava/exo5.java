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
public class exo5 {
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("position du jour");
        int num=sc.nextInt();
        
        switch(num){
            case 1 -> System.out.println("Lundi");
            case 2 -> System.out.println("Mardi");
            case 3 -> System.out.println("Mercredi");
            case 4 -> System.out.println("Jeudi");
            case 5 -> System.out.println("Vendredi");
            case 6 -> System.out.println("Samedi");
            case 7 -> System.out.println("Dimanche");
            
            default -> System.out.println("Aucun jour de la semaine ne correspond ");
                
                
    }
        
        
    }
    
}
