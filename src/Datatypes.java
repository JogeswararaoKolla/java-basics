import java.util.Scanner;

public class Datatypes {

    public static int add(int firstNumber,int SecondNumber){
        return firstNumber + SecondNumber;
    }
/*
if we remove static keyword and compile the program
Error you are trying to call non-static from a static method main
if we want to call non-static method from static method here main you need to create an instance
static methods can be invoked without creating instance of the class
static method belongs to the class
 */

    public static int multiply(int firstNumber,int SecondNumber){
        return firstNumber * SecondNumber;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number1:");
        int number1=input.nextInt();
        System.out.println("Enter a number2:");
        int number2=input.nextInt();
        int sum=add(number1 ,number2);
        System.out.printf("Sum of numbers (%d,%d)=%d\n",number1,number2,sum);
        System.out.printf("Multiply of numbers (%d,%d)=%d",number1,number2,multiply(number1,number2));
    }
    /*
    <access modifier> <return type> <method name> ([parameter list]){
      statement1;
      statements2;
      return value;
      }
      Access modifier : public,private and others
      static : static indicates that method belongs to that class
      Return Type: Data type of values returned by the method or void if no value
      Method Name: Method names are according to the Naming Convention
      Parameter List : input to the method
    */
}
