public class arraylarg{
    public static int largearray(int numbers[]){
        int largest=Integer.MIN_VALUE;

        for (int i = 0; i <numbers.length; i++) {
            if(largest<numbers[i]){
                largest=numbers[i];
            }  
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,9,10,8};
        System.out.println("largestvalue is : " + largearray(numbers));
    }
}