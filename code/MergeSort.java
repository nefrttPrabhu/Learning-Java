import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] unsortedArray = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));
        
        mergeSort(unsortedArray);
        
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));
    }
    
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Nothing to sort
        }
        
        int middle = arr.length / 2;
        
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];
        
        // Copy data to left and right subarrays
        System.arraycopy(arr, 0, left, 0, middle);
        System.arraycopy(arr, middle, right, 0, arr.length - middle);
        
        // Recursively sort the left and right subarrays
        mergeSort(left);
        mergeSort(right);
        
        // Merge the sorted subarrays
        merge(arr, left, right);
    }
    
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        // Compare elements from left and right subarrays and merge them into the main array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        // Copy any remaining elements from left and right subarrays (if any)
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}