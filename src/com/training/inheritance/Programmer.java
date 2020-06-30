package com.training.inheritance;

// Employee class is called as Parent class or Super class
// Programme class is called child class
public class Programmer  extends  Employee implements  IRunner,IDancer{

    String[]  programmingLanguages;
    public Programmer(String name,String address,String phoneNumber,String[] programmingLanguages){
       super(name,address,phoneNumber); // Calling the Super class or parent or base class
        this.programmingLanguages=programmingLanguages;
    }
    // override the methods
    public void work(){
        System.out.println("I am programmer, I write Code !");
    }

    public void run(){
        System.out.println("Programmer is running ");
    }

    public void dance(){
        System.out.println("Programmer is Dancing ");
    }

}

