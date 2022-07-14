/*
 * Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.

 */

 import java.util.*;
public class Rotate_array_k_times {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 100, 40, 90};
        int k = 8;
        Rotate_array_k_times obj = new Rotate_array_k_times();
        System.out.println("Original array: " + Arrays.toString(arr));
        obj.rotateArray(arr, k);
        System.out.println("Rotated array: " + Arrays.toString(arr));

    }

    void rotateArray(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    void reverse(int[] a, int i, int j) {
        int t = 0;
        while(i<j){
            t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++; j--;
        }
    }
}
