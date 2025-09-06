import java.util.Arrays;

public class Quicksort {
    static int sort(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int x = si - 1;
        for (int i = si; i < ei; i++) {
            if (arr[i] < pivot) {
                x++;
                int temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
            }
        }
        x++;
        int temp = arr[x];
        arr[x] = arr[ei];
        arr[ei] = temp;

        return x;
    }

    static void partition(int arr[], int si, int ei) {
        if (si < ei) {
            int pi = sort(arr, si, ei);
            partition(arr, si, pi - 1);
            partition(arr, pi + 1, ei);
        }
    }

    public static void main(String[] args) {
        int arr[] = {24, 22, 45, 67, 89, 90, 23, 27, 60};
        partition(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
