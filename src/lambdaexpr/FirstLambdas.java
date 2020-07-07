package lambdaexpr;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambdas {
    public static void main(String[] args) {

        /* @FunctionalInterface
         public interface Supplier<T> {
         T get();
         }
          <T> the type of results supplied by this supplier
          Represents a supplier of results.
          */

        Supplier<String> supplier=()->  { return  "hello World"; };
        String string= supplier.get();

        System.out.println("string=" + string);

        /*
        @FunctionalInterface
        public interface Consumer<T> {
        void accept(T t);
        Performs this operation on the given argument.
        @param t the input argument
        }
         */
        Consumer<String> consumer=(String s) -> System.out.println(s);
        consumer.accept("Hello from Consumer Interface");
    }
}
