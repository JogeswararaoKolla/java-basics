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

public class Unit4Lambda {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,40,50);

        process(numbers,0,wrapperLambda((v,k)-> System.out.println(v /  k)));
    }
    public static void process(List<Integer> numbers,Integer key, BiConsumer<Integer,Integer> consumer){
        for(Integer number :numbers){
            consumer.accept(number,key);
        }
    }
// Wrapper lambda function creates new lambda expression and sends to the calling function
    public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
       return (v,k)-> {
           try {
               consumer.accept(v, k);
           } catch(ArithmeticException e ){
               System.out.println("Exception from the wrapper lambda");
           }
       };
    }


}