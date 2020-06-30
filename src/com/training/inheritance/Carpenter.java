package com.training.inheritance;

public class Carpenter extends Worker implements IRunner{
    public void doWork(){
        System.out.println("I create table artifact");
    }
    // Override
    public void run(){
        System.out.println("carpenter is running !");
    }
}

interface IRunner {
    void run(); // public abstract methods
    default void show(){
        System.out.println("I show code");
    }
}

interface IDancer{
    void dance();
}