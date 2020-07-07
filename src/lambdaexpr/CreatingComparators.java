package lambdaexpr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;


public class CreatingComparators {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("one","two","three","four","five");
        /*
        @FunctionalInterface
       public interface Comparator<T> {
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     *         first argument is less than, equal to, or greater than the
     *         second.
        int compare(T o1, T o2);
         */
        Comparator<String> cmp1=(String s1, String s2) -> s1.compareTo(s2);

        strings.sort(cmp1);

        System.out.println(strings);

        Comparator<String> cmp2=(s1,s2) -> Integer.compare(s1.length(),s2.length());

        strings.sort(cmp2);

        System.out.println(strings);

//        Function<String ,Integer>  toLength= (s)-> s.length();
//       Comparator<String> cmp3=Comparator.comparing(toLength);

        // ToIntFunction takes any type T and return int as primitive type
        ToIntFunction<String> toLength= s-> s.length();
        // Comparator has a  static method  comparingInt
        Comparator<String> cmp3=Comparator.comparingInt(toLength);

        /*
         public static <T, U> Comparator<T> comparing(
            Function<? super T, ? extends U> keyExtractor,
            Comparator<? super U> keyComparator)
          {
        Objects.requireNonNull(keyExtractor);
        Objects.requireNonNull(keyComparator);
        return (Comparator<T> & Serializable)
            (c1, c2) -> keyComparator.compare(keyExtractor.apply(c1),
                                              keyExtractor.apply(c2));
          }
         */

        /*
          public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        return (Comparator<T> & Serializable)
            (c1, c2) -> Integer.compare(keyExtractor.applyAsInt(c1), keyExtractor.applyAsInt(c2));
        }
         */

        strings.sort(cmp3);

        System.out.println(strings);


    }
}
