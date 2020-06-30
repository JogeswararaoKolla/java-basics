package javaExamples;

public class EmployeeDemo {
    public static void main(String[] args){
        Employee joe=new Employee("Jogi",30);
        Employee john=new Employee("John",26);
        Employee other=new Employee();

        joe.greet();
        joe.work();
        john.greet();
        john.work();
        other.greet();
        other.work();

    }
}

