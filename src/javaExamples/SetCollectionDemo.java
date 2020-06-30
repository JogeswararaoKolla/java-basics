package javaExamples;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionDemo {
    public static void main(String[] args) {

        //Set is interface supports only unique Elements
        //HashSet is class which implements Set
        //Elements will not saved in sequence
        Set<Integer> values=new HashSet<>();
        values.add(6);
        values.add(10);
        values.add(9);
        values.add(97);
        System.out.println(values.add(6));// returns false if element is duplicate
        values.forEach(System.out::println);

    }
}
