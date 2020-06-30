package javaExamples;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array_int=new int[5];
        System.out.println(array_int.length);
        String[]  array_string={"Jogi","Kolla"};
        System.out.println(array_string.length);
        String[] array_string_copy= Arrays.copyOf(array_string,array_string.length);
        for(String item:array_string_copy){
            System.out.println(item);
        }
    }
}
