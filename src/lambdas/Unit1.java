package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1 {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Jogi","Kolla",31),
                new Person("Suma","Gadireddy",26),
                new Person("Humisha","Kolla",1)
        );

        // Step1 : Sort list by last name

        Collections.sort(people,new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getFirstName());
            }
        });

        System.out.println(people);

        // Step2 : create a method print all elements in list
        printAll(people);

        // Step3 : Create a method that prints all people that have last name starting with "K"

        // printLastNameBeginningWithK(people);

        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("G");
            }
        });
    }

    public static void printConditionally(List<Person> people,Condition condition){
    for(Person p: people){
        if(condition.test(p)){
            System.out.println(p.toString());
        }
    }

}

    public static void printAll(List<Person> people){
        for(Person p : people){
            System.out.println(p.toString());
        }
    }

    public static void printLastNameBeginningWithK(List<Person> people){
      for(Person p: people){
          if(p.getLastName().startsWith("K")){
              System.out.println(p.toString());
          }
      }
    }

    interface  Condition {
        boolean test(Person p);
    }
}
