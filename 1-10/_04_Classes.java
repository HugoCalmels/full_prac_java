

public class _04_Classes {
  // Exercices sur les classes
  public static void main(String[] args) {
    // Exercice 1 : Créer une classe "Person" avec des attributs
    // -> _04_Person.java
    _04_Person p = new _04_Person("hugo", 35, "Toulouse");
    
    // Exercice 2 : Créer une classe "Cercle" avec des attributs et des méthodes
    // -> _04_Circle.java
    _04_Circle c = new _04_Circle(14.2);
    System.out.println(c.calcSurface()); // --> only available with public methods 
    System.out.println(c.calcPerimeter());

    // Exercice 3 : Créer une classe "Compte" avec des attributs et des méthodes
    // -> _04_BankAccount.java
    _04_BankAccount b = new _04_BankAccount("Hugo Calmels", 1000);
    System.out.println(b.deposit(500));
    System.out.println(b.withdraw(1250));
    b.display();

    // Exercice 4 : Gestion d'une librairie
    // -> _04_Book.java
    // -> _04_Library.java
    _04_Library lib = new _04_Library();
    _04_Book b1 = new _04_Book("Le monde de Narnia", "Steven G", 2003);
    lib.addOneBook(b1);
    lib.research("Narnia");
    _04_Book b2 = new _04_Book("Le monde de Narnia 2", "Steven G", 2004);
    _04_Book b3 = new _04_Book("Le monde de Narnia 3", "Steven G", 2005);
    lib.addOneBook(b2);
    lib.addOneBook(b3);
    lib.displayAllBooks();

  }
}
