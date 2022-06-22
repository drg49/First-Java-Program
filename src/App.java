package Tester.src;
import java.util.Arrays;
import java.util.List;

import Tester.src.Classes.Person;

public class App {
    public static void main(String[] args) {
        //testOne();
        List<Person> persons = Arrays.asList(
                new Person(0, "Jet", 56),
                new Person(1, "Dan", 21) 
            );

        for(Person item : persons){
            System.out.println(item.name);
        }
    }

    private static void testOne() {
        Person myFriend = new Person(001, "Dan Gavin", 22);
        System.out.println("Key: " + myFriend.key);
        myFriend.printName();
    }
}
