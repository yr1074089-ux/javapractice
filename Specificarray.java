public class Specificarray {
    static void findlargest(int arr[]){
        int max =Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;

        for (int num : arr) {
           if (num<max){
               secondmax=max;
               max=num;
               System.out.println("maximum" + max);
           } 
           else if(num>secondmax && num<max){
            secondmax=num;
            System.out.println("second maximum "+secondmax);
           }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,67,78,9,12,6};

        System.out.println( arr);

    }
}
