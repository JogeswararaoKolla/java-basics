import java.util.Scanner;

public class SwitchClassDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a month number: ");
        int month_no=input.nextInt();
        String month=null;
        switch(month_no){
            case 1:
            case 2:
            case 3: month="Quarter1"; break;
            case 4: month="Quarter2"; break;
            case 5: month="Quarter2"; break;
            case 6: month="Quarter2"; break;
            case 7: month="Quarter3"; break;
            case 8: month="Quarter3"; break;
            case 9: month="Quarter3"; break;
            case 10: month="Quarter4"; break;
            case 11: month="Quarter4"; break;
            case 12: month="Quarter4"; break;
            default: month="unkown"; break;
        }
        System.out.println("Month Falls in "+ month);
    }
}
