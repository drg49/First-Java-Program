package Tester.src.Classes;

public class Person {
  // The key of the person
  public int key;

  // The name of the person
  public String name;

  // The age of the person
  public int age;

  public Person(int key, String name, int age) {
    this.key = key;
    this.name = name;
    this.age = age; 
  }

  public void printName () {
    if (this.name != null && !this.name.isEmpty())
      System.out.println("My name is " + this.name);
  }
}
