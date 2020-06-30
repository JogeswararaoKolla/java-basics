package lambdas;

public class RunnableExample {
    public static void main(String[] args) {
        // it is example for anonymous inner class for Runnable interface implementation.
        Thread myThread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Interface with one method run");
            }
        });
        myThread.run();

        Thread myLambdaThread=new Thread(()-> System.out.println("Hello from Lambda Thread"));
        myLambdaThread.run();

    }
}
