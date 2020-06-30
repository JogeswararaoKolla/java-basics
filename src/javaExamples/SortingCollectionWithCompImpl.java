package javaExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCollectionWithCompImpl {
    public static void main(String[] args) {

        // if know values when creating the objects {{}} is called anonymous inner class
        List<Integer> numbers = new ArrayList<Integer>() {{
            add(305);
            add(998);
            add(774);
        }};
        // Comparator interface
        Comparator<Integer> p = new CompImpl();
        Collections.sort(numbers, p);
        System.out.println(numbers);
    }
}
