package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1Lambdas {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Jogi","Kolla",31),
                new Person("Suma","Gadireddy",26),
                new Person("Humisha","Kolla",1)
        );

        // Step1 : Sort list by last name
        Collections.sort(people,(Person o1,Person o2)-> o1.getLastName().compareTo(o2.getLastName()) );
// Collections knows people is collection
 // Here lambda expression

        System.out.println("Printing all persons..");
        // Step2 : create a method print all elements in list
        printConditionally(people,p->true);

        // Step3 : Create a method that prints all people that have last name starting with "K"
        // printLastNameBeginningWithK(people);
System.out.println("Printing all persons starting with K");
        printConditionally(people, p->p.getLastName().startsWith("K"));

        System.out.println("Printing all persons starting with G");
        printConditionally(people, p->p.getLastName().startsWith("G"));
    }
//Predicate is an interface which has an abstract method test returns boolean
    public static void printConditionally(List<Person> people, Predicate<Person> predicate){
        for(Person p: people){
            if(predicate.test(p)){
                System.out.println(p.toString());
            }
        }

    }


}

