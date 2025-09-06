public class ArrayCC{
    public static int Linearsearch(int numbers[], int key){
        for (int i =0; i <numbers.length; i++) {
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,5,6,1,7,8,9,0,};
        int key =0;

        int index=Linearsearch(numbers, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("KEY IS AT INDEX "+index);
        }
    }
}