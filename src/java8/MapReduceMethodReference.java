package java8;

import java.util.Arrays;
import java.util.List;

public class MapReduceMethodReference {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(12,20,35,46,55,75,68);
// Map and Filter are lazy methods it will exit once it finds value
        System.out.println(list1.stream()
                .filter(MapReduceMethodReference::isDivisible)
                .map(MapReduceMethodReference::mapDouble).findFirst().orElse(0));
    }
    public static boolean isDivisible(int i){
        System.out.println("In isDivisible" + i);
        return i%5==0;
    }
    public static int mapDouble(int i){
        System.out.println("In mapDouble" + i);
    return i*2;
    }
    /* In isDivisible12
In isDivisible20
In mapDouble20
40
*/

}
