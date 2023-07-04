import java.util.Scanner;

public class _03_Opérateurs {
  public static void main(String[] args) {
    // Exercice 1. Vérification de la majorité
    Scanner sc = new Scanner(System.in);

    System.out.println("Entrer votre date de naissance, pour vérifier si vous etes majeur :");
    int birthDate = sc.nextInt();
    final int CURRENT_YEAR = 2023;
    int age = CURRENT_YEAR - birthDate;

    if (age >= 18) {
      System.out.println("Vous êtes majeur !");
    } else {
      System.out.println("Vous n'êtes pas majeur");
    }

    // Exercice 2 : Calcul d'un pourcentage
    System.out.println("Saisir un nombre");
    int userNumber = sc.nextInt();
    System.out.println("Saisir un pourcentage");
    int userPercentage = sc.nextInt();

    double newNumber = (userNumber / 100.0) * userPercentage;
    // 100.0 car sinon il arrondi à 0
    // il faut spécifier ça en Java aussi

    System.out.println("Le pourcentage de "+userNumber+" par l'indice "+userPercentage+" est : "+newNumber);
    
    // vérification d'un palindrome.
    sc.nextLine(); 
    System.out.println("Saisir une chaine de caracteres pour déterminer \n s'il s'agit d'un palindrome.");
    String userInput = sc.nextLine();

    // Solution 1 :
    String userInputReverse = "";
    for (int i = userInput.length()-1; i >= 0; i--) {
      userInputReverse += userInput.charAt(i);
    }
    System.out.println(userInputReverse);

    // Solution 2 : avec StringBuilder ( comme un string, mais plus facile de bosser avec )
    System.out.println("Saisir une chaine de caracteres pour déterminer \n s'il s'agit d'un palindrome.");
    StringBuilder userInput2 = sc.nextLine();
    if (userInput2 == userInput2.reverse()) {
      System.out.println("Oui c'est un palindrome");
    } else {
      System.out.println("Non.");
    }
    


  }
}
