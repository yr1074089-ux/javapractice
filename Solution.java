import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int counter =1;
        while(counter<=n){
            sum += counter;
            counter++;
            System.out.print(sum+"  ");
        }
    }
}    