package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

//@FunctionalInterface
//public interface BiConsumer<T,U>{
//Represents an operation that accepts two input arguments and returns no result.
//void accept(T t, U u)
//Performs this operation on the given arguments.
//}

public class Unit3Lambda {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,40,50);

        process(numbers,5,(v,k)-> {
            try {
                System.out.println(v / k);
            } catch(ArithmeticException e){
                System.out.println("ArithmeticException Exception");
            }
        });
    }
    public static void process(List<Integer> numbers,Integer key, BiConsumer<Integer,Integer> consumer){
        for(Integer number :numbers){
            consumer.accept(number,key);
        }
    }


}
