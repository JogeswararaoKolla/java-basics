package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5,6);
        // values.forEach(System.out ::println); // passing method as reference
        // for every we need to execute println method
        // println is method belongs to object out
        // out object is static belongs to System class
        //reference of method we have specify the ::

        values.forEach(MethodReferenceDemo::doubleIt);
        System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
    }
    public static void doubleIt(int i){
        System.out.println(i*2);
    }
}

// stream or parallelStream for multi  thread execution.
// stream  has methods -- intermediate methods and terminate methods
// findFirst() orElse(0)
//Stream will allow only to run once






