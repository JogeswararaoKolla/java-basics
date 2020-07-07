package lambdaexpr;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SomeMapping {
    public static void main(String[] args) {
        User jogi=new User("Jogeswararao Kolla");
        User suma=new User("Sumarchitha G");
        User humisha=new User("Humisha Kolla");

        List<User> users= List.of(jogi,suma,humisha);

        System.out.println(users);

        List<String> names=new ArrayList<>();

       /* @FunctionalInterface
        public interface Function<T, R> {
            * Applies this function to the given argument.
            * @param <T> the type of the input to the function
            * @param <R> the type of the result of the function
            R apply(T t);
       */
        Function<User,String> toName= (User t) -> t.getName();
        // We are mapping user and calling the function toName with apply method that invoke the lambda
        for(User user: users){
           String name=toName.apply(user);
           names.add(name);
        }

        System.out.println(names);
        // Here forEach method taking the Consumer interface
        users.forEach((User u)-> System.out.println(u));
        // Here Compiler knows if we don't provide the types.
        names.forEach(u -> System.out.println(u) );

    }
}
