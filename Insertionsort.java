import java.util.*;
public class Insertionsort{
    static void insertionsort(int arr[]){
        for (int i = 1; i <arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while( j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        };
    }
    public static void main(String[] args) {
        int arr[]={24,23,56,78,89,90};
        int arr1[][]={
            {1,2,3},
            {3,4,5},
            {7,8,9}

        };
        Arrays.sort(arr);
            System.out.println(Arrays.binarySearch(arr, 89));
    }
}