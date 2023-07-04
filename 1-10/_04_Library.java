import java.util.ArrayList;

public class _04_Library {
  public _04_Library() { // ne prend aucun argument pour être crée !!
    this.bookList = new ArrayList<_04_Book>();
  }
  
  public void addOneBook(_04_Book book) {
    // this.bookList = this.bookList.add(book); --> ne pas réinitialiser 
    // --> juste muter l'array
    this.bookList.add(book);
  }

  
  public void research(String word) {
    for (int i = 0; i < bookList.size(); i++) {
      // System.out.println(bookList.get(i)); // retourne -1 si non trouvé
      _04_Book currentBook = bookList.get(i);
      if (currentBook.title.contains(word) || currentBook.author.contains(word)) {
        System.out.println(
            "Nous avons trouvé le livre et c'est : " + currentBook.title + ", de l'autheur : " + currentBook.author);
      } else {
        System.out.println("Nous n'avons trouvé aucun livre avec la référence :" + word);
      }
    }
  }
  
  public void displayAllBooks() {
    for ( _04_Book book : bookList){
      System.out.println("Titre : " + book.title + ", Autheur : " + book.author);
    }
  }
  
  ArrayList<_04_Book> bookList ;
}
