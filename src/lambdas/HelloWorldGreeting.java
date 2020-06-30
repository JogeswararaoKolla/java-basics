package lambdas;

import lambdas.Greeting;

public class HelloWorldGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("Hello world greeting!");
    }
}
