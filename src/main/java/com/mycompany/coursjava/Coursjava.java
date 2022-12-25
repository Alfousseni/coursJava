/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.coursjava;
import java.util.Scanner;

/**
 *
 * @author Alfousseni
 */
public class Coursjava {

    public static void main(String[] args) {
        
        Scanner saisie =new Scanner(System.in);
        int max;
        System.out.println("veuillez rentrer respectivement les trois nombre a tester");
        int a= saisie.nextInt();
        int b= saisie.nextInt();
        int c= saisie.nextInt();
        
        if(a>b){
            if(a>c){
                max=a;
            }
            else{
                max=c;
            }
        }
        else{
            if(b>c){
                max=b;
            }
            else{
                max=c;
            }
        }
        
        
        
      System.out.println("le maximum est :"+ max);
        
    }
}
