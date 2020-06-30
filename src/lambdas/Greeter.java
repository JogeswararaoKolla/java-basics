package lambdas;

public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {
        Greeter obj=new Greeter();
        // Obj is object created with class lambdas.Greeter

        Greeting helloGreeting=new HelloWorldGreeting();
        //helloGreeting object is instance of Greeting interface implemented with custom class HelloWorldGreeting.

        obj.greet(helloGreeting);

// We pass a behaviour and execute the behaviour.
// we created an interface and created a class which implements that interface with own implementation
// and finally passes instance of the behaviour to the method.

//lambdas are functions called lambda expression  which does not belongs to a class
//We have encapsulated a function code to a variable.

      Greeting  greetingFunction=()->System.out.println("Hello World greeting lambda expression");
      // Lambda expression
        obj.greet(greetingFunction);
        obj.greet(()->System.out.println("Hello World greeting Inline lambda expression"));
//create a new interface optional if you have an interface with one method matches to the signature of the lambda expression
//create one method in the interface which takes exact same signature as the lambda expression
//Signature of lambdaGreeting is matching the Greeting interface
// @Functional interface annotation to be used
// Any interface which has only one abstract method is called an Functional Interface


        MyLambda lambdaGreeting=()-> System.out.println("Lambda expression with own interface");
        lambdaGreeting.foo();

        // Inline implementation of an interface called as anonymous inner class.
        Greeting innerClassGreeting=new Greeting() {
            @Override
            public void perform() {
                System.out.println("Anonymous inner class");
            }
        };

        innerClassGreeting.perform();
    }

    interface MyLambda {
        void foo();
    }


}
