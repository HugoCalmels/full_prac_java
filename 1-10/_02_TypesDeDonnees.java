import java.util.Scanner;
import java.math.BigInteger;
public class _02_TypesDeDonnees {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    // Exercice 1 :
    System.out.println("Veuillez saisir votre nom");
    String userName = sc.nextLine();
    System.out.println("Veuillez saisir votre age");
    int userAge = sc.nextInt();
    sc.nextLine(); // --> Obligatoire
    // En fait nextLine() et nextInt() quand on mélange les deux ca,
    // ce sont deux méthodes qui intéragissent différement avec le tampon
    // Une histoire avec un \n du String qui est pas consommé
    System.out.println("Veuillez saisir votre taille");
    String userHeight = sc.nextLine();

    System.out.println("Vous etes" + userName + ", vous avez " + userAge + " et votre taille est de " + userHeight);

    System.out.println("---------------------");

    // Exercice 2 :
    System.out.println("Veuillez choisir un nombre, pour vérifier s'il est pair ou impair");

    /* Le switch ne peut utilisé que pour des valeurs qui correspondent au type de la variable testée.
    Ici en l'occurence, un int testé avec des booleans :(
     switch (userNumber) {
      case (userNumber % 2 == 0):
        System.out.println("Le nombre est pair");
        break;
      case (userNumber % 2 == 1):
        System.out.println("Le nombre est impair");
        break;
      default:
        System.out.println("Erreur : ce n'est pas un nombre");
        break;
    }
    */

    // --> Gérer les execptions sans import

    if (sc.hasNextInt()) { // ==> else not 
       int userNumber = sc.nextInt();
      if (userNumber % 2 == 0) {
      System.out.println("Le nombre est pair");
    } else if (userNumber % 2 == 1) {
      System.out.println("Le nombre est impair");
    }
    } else {
      System.out.println("Erreur : ce n'est pas un nombre");
    }
    
    // Exercice 3 :
    System.out.println("Veuillez saisir une température en degrés Celsius.");
    int celsiusTemperature = sc.nextInt();
    // F = ( C x 1.8 ) + 32
    double fahrenheitTemperature = (celsiusTemperature * 1.8) + 32;
    // Warning : dans Java les valeurs décimales sont traitées comme de type "double" et non "float"
    System.out.println("Fahrenheit Temperature: " + fahrenheitTemperature);

    System.out.println("-------------");

    // Exercice 4 : type de variable "long" // Factorial number :
    System.out.println("Saisir un nombre pour calculer sa factorielle");
    int userNumber3 = sc.nextInt(); // --> 22
    BigInteger res = BigInteger.ONE; // --> -522715136 // on excède trop rapidement la capacité d'une varialbe de type "int"

    
    for (int i = 1; i <= userNumber3; i++) {
      // res *= i; // --> Multiply
      res = res.multiply(BigInteger.valueOf(i));
    }
    // Formules "BigInteger" utilisées dans cet exercice
    // -> déclarer un nombre BigInteger par son type 
    // -> BigInteger.ONE qui réprésente 1 sous la forme BigInteger
    // -> BigInteger.multiply 
    // -> BigInteger.valueOf(something)
    
    System.out.println(res);

    System.out.println("----------");

 

Explications des corrections :

Import de java.math.BigInteger : Vous devez importer cette classe pour pouvoir utiliser le type BigInteger dans votre code.

Initialisation de res : Vous avez correctement utilisé BigInteger pour res, mais vous devez utiliser BigInteger.ONE pour initialiser la valeur de res à 1.

Utilisation de sc.nextInt() : Pour lire un entier à partir de l'entrée, vous devez utiliser sc.nextInt() plutôt que sc.nextBigInteger().

Utilisation de res.multiply() : Dans chaque itération de la boucle, vous devez multiplier res par la valeur de i en utilisant la méthode multiply() de BigInteger.

Utilisation de BigInteger.valueOf(i) : Pour convertir la valeur i en BigInteger, vous devez utiliser BigInteger.valueOf(i).

Ces corrections permettent de résoudre les problèmes suivants :

Utilisation de BigInteger pour gérer des entiers de grande taille.
Initialisation correcte de la variable res avec la valeur 1.
Lecture d'un entier à partir de l'entrée avec sc.nextInt().
Utilisation de la méthode multiply() pour effectuer la multiplication des valeurs res et i.
Conversion de la valeur i en BigInteger avec BigInteger.valueOf(i).
Avec ces corrections, votre code devrait fonctionner correctement pour calculer la factorielle du nombre sa





User
tu peux me donner la doc vis à vis de l'expression utilisée ( BigInteger.ONE ) je ne l'ai jamais vu auparavant
ChatGPT
Bien sûr ! L'expression BigInteger.ONE est une constante statique de la classe BigInteger et elle représente la valeur entière 1 sous forme de BigInteger.

La classe BigInteger de Java fournit des méthodes pour manipuler et effectuer des opérations sur des entiers de taille arbitraire. Pour initialiser une variable BigInteger avec la valeur 1, on peut utiliser la constante BigInteger.ONE au lieu de créer une nouvelle instance de BigInteger avec new BigInteger("1").

En utilisant BigInteger.ONE, vous obtenez une instance pré-existante et réutilisable de BigInteger qui représente la valeur 1. Cela permet d'économiser des ressources en évitant de créer une nouvelle instance à chaque fois que vous avez besoin de la valeur 1.

Voici un exemple d'utilisation de BigInteger.ONE :

java
Copy code
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger value = BigInteger.ONE;
        System.out.println(value); // Affiche 1
    }
}
Dans cet exemple, nous créons une variable value de type BigInteger et l'initialisons avec BigInteger.ONE. Ensuite, nous affichons la valeur de value, qui est 1.

En résumé, BigInteger.ONE est une constante statique qui représente la valeur 1 sous forme de BigInteger, ce qui facilite l'initialisation d'une variable BigInteger avec la valeur 1 sans avoir à créer une nouvelle instance.





User
Je suis pas sur de vouloir faire un exercice sur le type de données "byte", car pas l'impression qu'il est utilisé.
ChatGPT
Je m'excuse pour la confusion. J'ai mal interprété votre demande initiale. Vous avez raison, votre code ne traite pas du type de données "byte". Je vais me concentrer sur les corrections nécessaires pour le type de données "long" comme mentionné dans le commentaire de l'exercice. Voici le code corrigé :

java
Copy code
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir un nombre pour calculer sa factorielle");
        long userNumber3 = sc.nextLong();
        long res = 1;

        for (long i = 1; i <= userNumber3; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}
Explications des corrections :

Modification du type de données : J'ai modifié le type de données de userNumber3 et res de int à long pour correspondre à l'exigence de l'exercice.

Utilisation de sc.nextLong() : J'ai utilisé sc.nextLong() pour lire un nombre de type long à partir de l'entrée.

Utilisation de l'opérateur de multiplication : J'ai conservé l'opérateur de multiplication (*) pour multiplier res par i, car il fonctionne correctement avec des variables de type long.

Avec ces corrections, votre code devrait fonctionner correctement pour calculer la factorielle du nombre saisi, en utilisant le type de données "long".






Regenerate response

    // Exercice 5: type de variable "short" // Students + Classroom
    short maxNumberOfStudents = 24;
    int numberOfStudents = 15;
    Boolean isClassroomOkay = maxNumberOfStudents >= numberOfStudents;
    System.out.println(isClassroomOkay); 




  }
}
