import java.util.*;
public class reversearray{
    public static int reverse(int n[]){
        int first=0, last=n.length-1;
        while(first<last){
            int temp = n[last];
            n[last]=n[first];
            n[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int n[]={2,23,3,5,5,7,1,,9,0};
        reverse(n);
        for (int i = 0; i <n.length; i++) {
            System.out.println(n[i]+" ");
        }
        System.out.println();
    }
}