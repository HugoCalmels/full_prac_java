import java.util.Scanner;
import java.util.Random;

public class _01_VariablesEtConstantes {
  public static void main(String[] args) {
    // Exercice 1 :
    int age = 25;
    final int ANNEE_ACUTELLE = 2023;
    int birthDate = ANNEE_ACUTELLE - age;
    System.out.println("La date de naissance est : " + birthDate);

    // Exercice 2 :
    final double PI = 3.14159;
    double rayon = 5;
    double circumference = rayon * 2 * PI;
    System.out.println("La circonférence du cercle est de : " + circumference);

    // Exercice 3 :
    int a = 10;
    int b = 5;
    a = a + b; // a = 10 + 5 = 15
    b = a - b; // b = 15 - 5 = 10
    a = a - b; // a = 15 - 10 = 5 
    System.out.println("a : " + a);
    System.out.println("b : " + b);

    // Exercice 4 :
    int nombre = 51;
    if (nombre % 2 == 0) {
      System.out.println("Le nombre "+nombre+" est pair");
    } else {
      System.out.println("Le nombre " + nombre + "est impair");
    }
    
    // Exercice 5 :
    String nom = "Hugo Calmels";
    int LONGUEUR_MAX = 10;
    if (nom.length() >= LONGUEUR_MAX) {
      System.out.println("Le nom " + nom + " est trop long");
    } else {
      System.out.println("Le nom " + nom + " n'est pas trop long");
    }
    
    Scanner sc = new Scanner(System.in);
    
    // Exercice 6 :
    /* 
    Random rand = new Random();
    int upperbound = 100;
    int int_random = rand.nextInt(upperbound);
    int number_of_rounds = 0;

    System.out.println("Saisir un nombre ");
    int guessed_number = sc.nextInt();

    while (guessed_number != int_random) {

      if (guessed_number > int_random) {
        System.out.println("trop grand");
      } else {
        System.out.println("trop petit");
      }
      System.out.println("Re-Saisir un nombre ");
      guessed_number = sc.nextInt();
      number_of_rounds++;
    }
    
    System.out.println("Bravo, vous avez mis : " + number_of_rounds + " rounds pour trouver le nombre");
    */
    System.out.println("---------------------");
    
    // Exercice 7 :
    System.out.println("Saisir un nombre pour calculer la somme des chiffres qui le composent");
    // 1. Lancer le prompt
    int userNumber = sc.nextInt();
    // 2. Convertir le prompt integer en String
    String userNumberString = Integer.toString(userNumber);
    int res = 0;

    for (int i = 0; i < userNumberString.length(); i++) {
      // chatAt est une méthode de String qui retourne un caractere.
      // Tres compliqué par rapport à Ruby ou je fesais juste userNumberString[1]
      // Ensuite pour utiliser Character dans notre addition, on est obligés de le convertir en int.
      int number = Character.getNumericValue(userNumberString.charAt(i));
      res += number;
    }
    System.out.println(Integer.toString(res));

    System.out.println("------------------");

    // Exercice 8 :
    System.out.println("Saisir un nombre et afficher tous les nombres premiers inférieurs ou égaux à ce nombre");
    int userNumber2 = sc.nextInt();
    System.out.println("?????");
    // Par exemple n = 35
    // Trouver tous les nombres premiers inférieurs ou égaux à 35.

    for (int i = 2; i <= userNumber2; i++) {
      boolean isPrime = true;

      for (int z = 2; z <= Math.sqrt(i); z++) {
        if (i % z == 0) { // un nombre est premier s'il possede exactement 2 diviseurs qui sont 1 et lui meme
          // càd de 2 à racine de 15, par xemple, il n'y aura rien, donc la condition false sera pas appliquée
          // mais bordel de cul à nouilles que c'est compliqué ...
          isPrime = false;
          break;
        }
      }

      if (isPrime) {
        System.out.println(i);
      }
    }

    System.out.println("---------------");
 
    // Exercice 9
        System.out.println("Saisir un nombre pour la suite de Fibonacci");
    int userInput = sc.nextInt();

    // La suite de Fibo commence par 0 et 1.
    int fibonacciSequence[] = new int[userInput];
    fibonacciSequence[0] = 0;
    fibonacciSequence[1] = 1;

    for (int i = 2; i < fibonacciSequence.length; i++) {
      fibonacciSequence[i] = fibonacciSequence[i - 2] + fibonacciSequence[i - 1];
    }

    for (int i = 0; i < fibonacciSequence.length; i++) {
      System.out.println(fibonacciSequence[i]);
    }

    

   
    




    
  }
}
