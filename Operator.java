import java.util.*;
public class Operator{
    public static void main(String args []){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a: ");
        int a =scn.nextInt();
        System.out.println("enter b : ");
        int b =scn.nextInt();
        System.out.println("enter operator : ");
        char operator = scn.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
                break;
            case '-' : System.out.println(a-b);
                break;
            case '*' : System.out.println(a*b);
                break;
            case '/' : System.out.println(a/b);
                break;
            case '%' : System.out.println(a%b);
                break;
            default: System.out.println("no answer");
        }
    }
}