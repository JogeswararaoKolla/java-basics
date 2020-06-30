public class BreakDemo {
    public static void main(String[] args) {
        String  name="This is a long long string";
        int noofOs=0;
        for(int i=0;i<name.length();i++){
            if (name.charAt(i) == 'o'){
                noofOs++;
                System.out.println("*** O is found");
                continue;
            }
            System.out.println("O is not found");
        }
        System.out.println("No of Os :" + noofOs);
    }
}
