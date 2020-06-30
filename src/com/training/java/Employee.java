package com.training.java;

public class Employee {
    String employeeName;
    Integer employeeAge;
    /* This constructor function is called when create object from instance of this class
     Employee e=new Employee("Jogi",30);
     package are grouping of related classes. Example com.<Company name>.<project name>
     */
    public Employee(String employeeName,Integer employeeAge){
        this.employeeAge=employeeAge;
        this.employeeName=employeeName;
    }
    /* Constructor function without arguments */
 public Employee(){
        this.employeeName="default";
        this.employeeAge=25;
 }

    public void greet(){
        System.out.println("Good morning I am " + employeeName);
    }
    public void work(){
        System.out.println(employeeName + " is working");
    }
}
