import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class SortingCollection {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<Integer>();
        numbers.add(305);
        numbers.add(998);
        numbers.add(774);
 // Comparator interface
        Comparator<Integer> com=new CompImpl();

        Collections.sort(numbers,com);
       System.out.println(numbers);
    }
}
