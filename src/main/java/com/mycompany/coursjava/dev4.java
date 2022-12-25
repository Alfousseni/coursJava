/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coursjava;

/**
 *
 * @author Alfousseni
 */
import java.util.Scanner;

public class dev4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[10];

    // Demande à l'utilisateur de saisir 10 entiers
    for (int i = 0; i < 10; i++) {
      System.out.print("Saisissez un entier : ");
      numbers[i] = scanner.nextInt();
    }

    // Détermine les 5 premiers nombres premiers du tableau
    int count = 0;
    for (int number : numbers) {
      // Un nombre est premier s'il est divisible uniquement par 1 et par lui-même
      if (isPrime(number)) {
        System.out.println(number);
        count++;
        if (count >= 5) {
          break;
        }
      }
    }
  }

  // Méthode qui retourne vrai si le nombre passé en argument est premier, faux sinon
  public static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}

