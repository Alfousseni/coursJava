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
public class exo6 {
    public static void main(String[] args){
        int nu,i=0,p,nbri=0;
    
        do{
            Scanner sc= new Scanner(System.in);
        
            System.out.println("Entrer un nombre");
            nu=sc.nextInt();
            p=nu;
        
        
        
        }while(nu %10==0);
        
        while(nu!=0){
          int rest=p%10;  
         nu=nu/10;
         i=i+1;
         
         nbri=nbri*10;
         nbri=nbri+rest;
         p=p/10;
         
        }
        
        System.out.println("Le nombre  contiens "+i+" chiffres ");
        System.out.println("son inverse est contiens "+nbri);
        
    
    }
    
}
