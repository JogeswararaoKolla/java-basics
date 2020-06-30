package com.training.inheritance;

// keep common code in base class
// all Java classes are inherit from  object class implicit or explicit
// A class can inherit from single base class
// A class can implement ay number of interfaces
// An interface can extend another interface
// An interface cannot define constructor like class

public  abstract  class Employee {
    String name,address,phoneNumber;

    public Employee(String name,String address,String phoneNumber){
        this.address=address;
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
  public abstract void work(); // Child classes are forced to defined methods

}
