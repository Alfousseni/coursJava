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

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[10];

    // Demande à l'utilisateur de saisir 10 entiers
    for (int i = 0; i < 10; i++) {
      System.out.print("Saisissez un entier : ");
      numbers[i] = scanner.nextInt();
    }

    // Détermine le maximum, le minimum et leur position dans le tableau
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int maxIndex = -1;
    int minIndex = -1;
    for (int i = 0; i < 10; i++) {
      int number = numbers[i];
      if (number > max) {
        max = number;
        maxIndex = i;
      }
      if (number < min) {
        min = number;
        minIndex = i;
      }
    }

    // Affiche le maximum, le minimum et leur position dans le tableau
    System.out.println("Le maximum est " + max + " et se trouve à l'index " + maxIndex);
    System.out.println("Le minimum est " + min + " et se trouve à l'index " + minIndex);
  }
}
