package Tester.src;
import Tester.src.Classes.Person;

public class App {
    public static void main(String[] args) {
        Person myFriend = new Person(001, "Dan Gavin", 22);
        System.out.println("Key: " + myFriend.key);
        myFriend.printName();
    }
}
