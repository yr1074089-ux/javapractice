import java.util.*;
public class Conversion{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '1': System.out.println("sunday");
                break;
            case '2': System.out.println("monday");
                break;
            case '3': System.out.println("tuesday");
                break;
            case '4': System.out.println("wedenasday");
                break;
            case '5': System.out.println("thursday");
                break;
            case '6': System.out.println("friday");
                break;
            case '7': System.out.println("saturday");
                break;
            default: System.out.println("no any day of the week");
            
        }
        }
}