package java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8Demo {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,3,4,5,6);

        System.out.println("Iterator method usage in Lists");

        Iterator<Integer> i=values.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        // Consumer is an interface we need to declare a class to implement the interface..
        // we can implement consumer interface using anonymous class
  Consumer<Integer> c=new Consumer<Integer>(){
      @Override
      public void accept(Integer i) {
          System.out.println(i);

      }
  };
        System.out.println("Consumer Interface anonymous class implementation");

  values.forEach(c); // it will accept method.
// We are creating Consumer object c and pass a method accept.
//Method will have  method name  body  return type and parameters
       System.out.println("Lambda Expression");
        Consumer<Integer> b=(Integer y) -> System.out.println(y);
        values.forEach(b);

    }
}

