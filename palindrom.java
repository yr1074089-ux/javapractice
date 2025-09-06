import java.util.*;
public class palindrom{
    public static void main(String args[]){
        System.out.println("Plese enter the number");
        Scanner sc =new Scanner(System.in);
        int palindrom =sc.nextInt();
        if(isPalindrom(palindrom)){
            System.out.println("Number "+ palindrom + "is a palindrom");
        }else{
            System.out.println("Number "+ palindrom + "is  not a palindrom");
        }
    }
    public static boolean isPalindrom(int number){
        int palindrom = number;
        int reverse =0;

        while(palindrom!=0){
            int reminder = palindrom % 10;
            reverse = reverse *10 +reminder;
            palindrom=palindrom/10;
        }
        if(number == reverse){
            return true;
        }
        return false;
    }
}