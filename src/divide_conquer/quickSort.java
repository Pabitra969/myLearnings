package divide_conquer;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {6,3,5,2,8,9,4,-7};
        quickSort1(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void quickSort1(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element = pivot element
        int pivotIdx = partition(arr, si, ei);
        quickSort1(arr, si, pivotIdx-1); // left side
        quickSort1(arr, pivotIdx+1, ei); // right side
    }

    private static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;
    }
}
