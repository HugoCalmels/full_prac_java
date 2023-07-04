public class _04_Person {
  public _04_Person(String name, int age, String city) {
    // constructeur
    this.name = name;
    this.age = age;
    this.city = city;

    System.out.println("this person is : " + this.name + ", he is : " + this.age + ", and he lives in : " + this.city);
  }
  
  String name;
  int age;
  String city;
}
