package recursion;

public class lastOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5, 7, 8,5, 9,7};
        int key = 5;
        System.out.println(lastOccurence1(arr,key,0));
    }

    public static int lastOccurence1(int[] arr, int key, int i) {
        if (i == arr.length-1) {
            return -1;
        }
        int isFound = lastOccurence1(arr, key, i+1);
        if (isFound != -1) {
            return isFound;
        }

        // check with self
        if (arr[i] == key) {
            return i;
        }
        return isFound;
    }
}
