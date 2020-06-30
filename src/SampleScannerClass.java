import java.util.Scanner;

public class SampleScannerClass {
    public static void main(String[] args) {
        /* Scanner class breaks the input into tokens.
           Each token is separated by token default is white space*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=input.next();
        System.out.println("Enter your age:");
        Integer age=input.nextInt();
        System.out.println("Your name is :" + name);
        System.out.println("Your age is :" + age);

    }
}
