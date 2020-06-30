package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.function.Function;

public class MapReduceFilterDemo {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5,6);
        System.out.println(values.stream().map(i->i).reduce(100,(result,current)->
                result+current));

        List<Integer> list1= Arrays.asList(12,20,35,46,55,75,68);

       System.out.println(list1.stream().filter(i->i%5==0).map(i->i*2).findFirst().orElse(0));
// findFirst() terminates when it finds an element if doesn't exits it will give default 0;
//        System.out.println(list1.stream()
//                .filter(i->i%5==0)
//                .reduce(0,(c,e)->c+e));
        Predicate<Integer> p=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%5==0;
            }
        };
    //so it supports lambda expression
        // if it returns false it filters the elements
   //predicate is functional interface takes only one argument and returns a type of boolean value

        System.out.println(values.stream().filter(p));

        //Function Interface

        Function<Integer,Integer> f=new Function<Integer,Integer>(){
           public  Integer apply(Integer i ){
                return i*2;
            }
        };

        Stream s=values.stream();

       Stream s1= s.map(f);

        BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer o1, Integer o2) {
                return o1+o2;
            }
        };

       Integer c= (Integer) s1.reduce(0,b);

        System.out.println(c);

        // values to stream() stream object
    }
}
