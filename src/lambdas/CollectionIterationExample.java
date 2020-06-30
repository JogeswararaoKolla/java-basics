package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Jogi","Kolla",31),
                new Person("Suma","Gadireddy",26),
                new Person("Humisha","Kolla",1)
        );

        System.out.println(people
                .stream()
                .filter(p->p.getLastName().startsWith("K"))
                .min((a,b)->a.getAge()-b.getAge()));

        System.out.println(people
                .stream()
                .filter(p->p.getLastName().startsWith("K"))
                .min((a,b)->b.getAge()-a.getAge()));

        System.out.println(people.stream().map(Person::getFirstName).collect(Collectors.joining(",")));
        List<String> firstNames=people.stream().map(Person::getFirstName).collect(Collectors.toList());
        System.out.println(firstNames);

    }
}
