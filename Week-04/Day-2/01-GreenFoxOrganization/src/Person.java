public class Person {

  String name;
  int age;
  String gender;
  String goalMessage = "My goal is: ";


  public Person (String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + "year old " + gender + ".");
  }

  public void getGoal() {
    System.out.println(goalMessage + "Live for the moment!");

  }

  public Person(){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }
}
