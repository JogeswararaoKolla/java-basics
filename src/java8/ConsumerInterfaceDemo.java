package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Functional interface is only one method declared.
//single abstract method interfaces are called functional interface
// lambda expression is used for only functional interface
public class ConsumerInterfaceDemo {
    public static void main(String[] args) {

        List<Integer> values= Arrays.asList(1,3,4,5,6);

        values.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}


