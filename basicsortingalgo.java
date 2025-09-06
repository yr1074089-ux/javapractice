public class basicsortingalgo{
    public static void selectionsort(int arr[]){
        for (int i = 0; i <arr.length-1; i++) {
            int minsort=i;
            for (int j =i+1; j <arr.length; j++) {
                 if(arr[minsort]>arr[j]){
                    minsort=j;
                 }   
            }
            int temp=arr[minsort];
            arr[minsort]=arr[i];
            arr[i]=temp;
            
        }
    }
    public static void inserationsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];   // store current value
            int prev = i - 1;

            // shift elements greater than curr to the right
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // place curr at its correct position
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 6, 3, 1, 2};
        inserationsort(arr);
        printArr(arr); // print sorted array
    }
}
