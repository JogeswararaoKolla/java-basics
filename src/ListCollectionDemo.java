import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCollectionDemo {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(55,70,89,23,12);

        // if know values when creating the objects {{}} is called anonymous inner class
        List<Integer> values=new ArrayList<>(){{
            add(10); // adding an element
            addAll(numbers); // adding an collection
        }};

        System.out.println(values);
        System.out.println(numbers);
    }
}
