package javaExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//T is class which extends Number class example Integer and Double extends Number Class
 class Container<T extends Number>{
     T value;

     public T getValue() {
         return value;
     }

     public void setValue(T value) {
         this.value = value;
     }

     public void show(){
     System.out.println(value.getClass().getName());

 }
    public void arrayDemo( ArrayList<? extends T> obj){
        System.out.println(obj.getClass().getName());
    }
    // ? extend subclasses of T
    // ? extends super T means ? can be super class of T
}
public class DemoCollection {

    public static void main(String[] args) {
//        java.Container<Integer> obj1=new java.Container<>();
//        obj1.value=10;
//         obj1.show();
//
//         java.Container<Number> obj2=new java.Container<>();
//         obj2.value=30.0;
//         obj2.show();
//
//         obj2.arrayDemo(new ArrayList<Integer>());

 // We working with generics it has to be class
//        List<Integer> values=new ArrayList<>();
//        values.add(10);
//        values.add(20);
//        System.out.println(values);

//        Object values1[]=new Object[4];
//        values1[0]="jogi";
//        values1[1]=31;
//        System.out.println(values1);
// defining the return type of the collection called generics

        Collection<Integer> values2=new ArrayList<Integer>();
        //Collection of objects


//        values2.add(25);
//        values2.add(29);
//        values2.add(35);
//        System.out.println(values2);
//        values2.remove(29);

//        Iterator i=values2.iterator();
//
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }

        List<Integer> values3=new ArrayList<Integer>();

        values3.add(34);
        values3.add(30);
        values3.add(40);
        values3.add(1,20);

//        Collections.sort(values3);

        System.out.println(values3.contains(40));
        System.out.println(values3.remove(3));


//        System.out.println(values3.size());
        values3.forEach(System.out::println); // Steam API.. lambda expression
//        values3.removeAll(values3);
//        System.out.println(values3.isEmpty());

//      for(Object obj : values3){
//          System.out.println(obj);
//      }

    }
}


