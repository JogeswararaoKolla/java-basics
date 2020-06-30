package javaExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class DuplicatesDemo {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Jogi");
        names.add("Kolla");
        names.add("Suma");
        names.add("Humisha");
        names.add("Jogi");
        names.add("Kolla");

        Set<String> unique_names=new HashSet<>();
        // unique_names.addAll(names); // Adding a collection of elements to a Set
        //when adding duplicate element to the set it returns false.
        for(String s : names){
            if(unique_names.add(s)==false){
                System.out.println(s);
            }
        }

        System.out.println(names);
        System.out.println(unique_names);


    }
}
