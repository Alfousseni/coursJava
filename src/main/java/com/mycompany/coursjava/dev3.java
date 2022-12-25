/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coursjava;

/**
 *
 * @author Alfousseni
 */
public class Main {
  public static void main(String[] args) {
    // Parcours toutes les années comprises entre 1990 et 2022
    for (int year = 1990; year <= 2022; year++) {
      // Une année est bissextile si elle est divisible par 4, mais pas par 100, à moins qu'elle soit divisible par 400
      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        System.out.println(year);
      }
    }
  }
}

