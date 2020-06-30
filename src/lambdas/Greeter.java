public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {
        Greeter obj=new Greeter();
        // Obj is object created with class Greeter

        Greeting helloworldgreeting=new HelloWorldGreeting();

        helloworldgreeting.perform();
    }

}
