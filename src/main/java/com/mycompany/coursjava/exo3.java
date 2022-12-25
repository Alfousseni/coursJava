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
public class exo3 {
    public static void main(String[] args){
        Scanner recup= new Scanner(System.in);
        
        System.out.println("entrer la valeur");
        
        int nombre=recup.nextInt();
        
        if(nombre%2==0){
            System.out.println("le nombre "+ nombre + " est paire");
        }
        else{
            System.out.println("le nombre "+ nombre + " est paire");

        }
        
    }
    
}
