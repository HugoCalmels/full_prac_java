public class _04_BankAccount {
  public _04_BankAccount(String holder, int balance) {
    this.holder = holder;
    this.balance = balance;
  }

  public double deposit(int number) {
    return this.balance = this.balance + number;
  }
  
  public double withdraw(int number) {
    return this.balance = this.balance - number;
  }

  public void display() {
    // Erreur de noob : impossible de concaténer String + int
    // System.out.println("This account has : " + this.balance + " euros left on the account");
    System.out.println("This account has : " + String.valueOf(this.balance) + " euros left on the account");
  }

  String holder;
  int balance;
}
