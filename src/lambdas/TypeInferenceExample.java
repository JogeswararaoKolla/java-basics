package lambdas;

public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLengthLambda MyLambda=s->s.length();
        //MyLambda expression is checked with interface StringLengthLambda to match with method signature
        System.out.println(MyLambda.getLength("hello"));
        printLambda(s->s.length());

    }
    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello Lambda"));
    }
    interface StringLengthLambda {
        int getLength(String s);
    }
}
