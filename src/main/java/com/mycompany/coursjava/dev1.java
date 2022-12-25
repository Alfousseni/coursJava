import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Demande à l'utilisateur de saisir un nombre entier supérieur ou égal à 10 000
    System.out.print("Saisissez un nombre entier supérieur ou égal à 10 000 : ");
    int n = scanner.nextInt();

    // Vérifie que le nombre est supérieur ou égal à 10 000
    if (n < 10000) {
      System.out.println("Vous devez saisir un nombre entier supérieur ou égal à 10 000 !");
      return;
    }

    // Affiche tous les nombres parfaits compris entre 1 et la valeur saisie
    for (int i = 1; i <= n; i++) {
      // Un nombre est parfait s'il est égal à la somme de ses diviseurs
      int sum = 0;
      for (int j = 1; j < i; j++) {
        if (i % j == 0) {
          sum += j;
        }
      }
      if (sum == i) {
        System.out.println(i);
      }
    }
  }
}
