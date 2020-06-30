package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit2Lambdas {
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
        performConditionally(people,p->true,p->System.out.println(p));

        // Step3 : Create a method that prints all people that have last name starting with "K"
        // printLastNameBeginningWithK(people);
        System.out.println("Printing all persons starting with K");
        performConditionally(people, p->p.getLastName().startsWith("K"),p->System.out.println(p));

        System.out.println("Printing all persons starting with G");
        performConditionally(people, p->p.getLastName().startsWith("G"),p->System.out.println(p.getFirstName()));
    }
    //Predicate is an interface which has an abstract method test returns boolean
    // When we want to convert  System.out.println(p.toString()); to a lambda expression we need to find an interface which has an abstract method takes the input and does not return anything.
    //@FunctionalInterface
    //public interface Consumer<T> { }
    //void accept(T t) -Performs this operation on the given argument.
    // t - the input argument
    public static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p: people){
            if(predicate.test(p)){
               consumer.accept(p);
            }
        }

    }


}


