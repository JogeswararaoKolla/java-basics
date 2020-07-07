package lambdaexpr;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ChainingLambdas {
    public static void main(String[] args) {
        Consumer<String> c1= s-> System.out.println("c1 consumes " + s);
        Consumer<String> c2= s-> System.out.println("c2 consumes " + s);

//        c1.accept("hello");
//        c2.accept("hello");

        Consumer<String> c3= s->{
            c1.accept(s);
            c2.accept(s);
        };

        c3.accept("hello");

        Consumer<String> c4=c1.andThen(c2);

        c4.accept("c4 data");

        Predicate<String> isNull= s->s==null;
        // calling the predicate function isNull with test method
        System.out.println("For null=" + isNull.test(null));
        System.out.println("For Jogi =" + isNull.test("Jogi"));

        Predicate<String> isEmpty= s-> s.isEmpty();
        // calling the predicate function isEmpty with test method
        System.out.println("For Empty = " + isEmpty.test(""));
        System.out.println("For value = " + isEmpty.test("Kolla"));

        Predicate<String> p = isNull.negate().and(isEmpty.negate());
        System.out.println("For null predicate p" + p.test(null));
        System.out.println("For Empty predicate p" + p.test(""));
        System.out.println("For Value predicate p " + p.test("Jogi"));

    }
}
