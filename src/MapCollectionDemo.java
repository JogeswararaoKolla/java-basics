import  java.util.Map;
import  java.util.HashMap;
import  java.util.Set;

public class MapCollectionDemo {
    public static void main(String[] args) {
        /* Java's map data type is called a HashMap. They're conceptually similar
         *   to JavaScript's objects, so you mostly just have to wrap your head
         *   around some new syntax and you'll be good to go. */

        /* When you define a HashMap, you ned to declare the type of the key, and
         *   the type of the corresponding values. If we want our keys to be an
         *   employee's last name, and the value to be their salary, we'd have a
         *   HashMap with String keys and Integer values.
         *
         *   The only gotcha here is that, when you declare types in a HashMap,
         *   you must refer to ints as Integers; booleans as Boolean; etc. This
         *   has to do with how Java stores data internally. You don't have to know
         *   these details today, but it's worth a Google if you plan to work with
         *   Java further.
         *
         *   The particular cases you'll need are:
         *
         *     double -> Double
         *     boolean -> Boolean
         *     int -> Integer
         */

        // Be sure to say Integer-not int
        // Below are 2 types of implementations calling Interface name or class name
        // HashMap<String, Integer> payroll = new HashMap<>();
        // HashMap is not synchronized and fast works with single thread application

        Map<String, Integer> payroll = new HashMap<>();

        // To set a key's value, use put.
        payroll.put("Jogi", 100000);

        // To retrieve the value of a key, use get.
        payroll.get("Jogi");

        /* To retrieve the value of a key, with a default if the key doesn't exist,
         * use getOrDefault. You should always use this instead of get! */
        System.out.println(payroll.getOrDefault("Kolla", -1));

        // There are a couple of ways to iterate a map, but forEach is the easiest.
        payroll.put("Suma", 95000);
        payroll.forEach((last, salary) -> {
            System.out.println(String.format("%s's salary is %d.", last, salary));
        });

        Set<String> keys=payroll.keySet(); // keySet is method used to get all the keys

        for(String key:keys){
            System.out.println(key + "," +payroll.get(key));
        }
/*     Map is interface has Entry interface  has method call entrySet() to give one entry K,V
        interface Entry<K, V> {
            K getKey();
            V getValue();
            V setValue(V value);
        }
        */

        Set<Map.Entry<String,Integer>> values=payroll.entrySet();

        for(Map.Entry<String,Integer> e : values){
            System.out.println(e.getKey() + ":" + e.getValue());
        }

    }
}
