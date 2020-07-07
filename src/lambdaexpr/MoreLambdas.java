package lambdaexpr;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MoreLambdas {
    public static void main(String[] args) {
        List<String> strings=new ArrayList<>(List.of("one","two","three","four"));
        System.out.println(strings);

       /* @FunctionalInterface
        public interface Predicate<T> {
             * Evaluates this predicate on the given argument.
             * @param t the input argument
            boolean test(T t);
        }
        */
        Predicate<String> filter=(String s) -> s.startsWith("t");
        strings.removeIf(filter);
        Consumer<String> action= (String s) -> System.out.println(s);
        strings.forEach(action);
    }
}
