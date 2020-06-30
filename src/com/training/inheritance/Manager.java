package com.training.inheritance;

public class Manager extends Employee {
    String name, address, phoneNumber;
    int teamSize;

    public Manager(String name, String address, String phoneNumber, int teamSize) {
       super(name,address,phoneNumber);
        this.teamSize = teamSize;
    }

    // override of methods
    // if we comment this method it refers to base class methods
    public void work() {
        System.out.println("I am Manager, I manage TEam !");
    }

    public static void main(String[] args) {
        Employee m1 = new Manager("Suma", "Address1", "Phone1", 10);
        m1.work();
        Employee p1 = new Programmer("Jogi", "Address1", "Phone1", new String[]{"java", "javascript"});
        p1.work();
        IDancer d1=new Programmer("Humisha", "Address1", "Phone1", new String[]{"java", "javascript"});
        d1.dance();
    }

}
