import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollectionDemo {
    public static void main(String[] args) {
        //Set is interface supports only unique Elements
        //TreeSet is class which implements Set
        //Elements will be saved in sequence
        Set<Integer> values=new TreeSet<>();
        values.add(6);
        values.add(10);
        values.add(9);
        values.add(97);
        System.out.println(values.add(6));// returns false if element is duplicate
        values.forEach(e-> System.out.println(e));
    }
}

