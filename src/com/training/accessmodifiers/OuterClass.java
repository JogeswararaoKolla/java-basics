package com.training.accessmodifiers;

public class OuterClass {

    private int var=5;
//Non static nested class also known as inner classes.
    class NestedClass1 {
        private int varInner=var + 5;

    }
    // static nested class
   static class NestedClass2{

    }
}
