import java.util.*;

public class Sort_Array_of_012 {
    public static void main(String[] args) {
        int arr[] = {2, 1, 0, 0, 1, 2, 1, 0, 1, 1, 0, 0, 2, 1, 2, 0, 1};
        int n = arr.length;

        sort012(arr, n);
    }

    public static void sort012(int[] arr, int n) {
        int low = 0;
        int mid = 0; 
        int high = n-1;

        System.out.println(Arrays.toString(arr));

        while(mid <= high) {
            
            switch(arr[mid]) {
                case 0:
                    swap(arr, low, mid); low++; mid++; break;
                case 1:
                    mid++; break;
                case 2:
                    swap(arr, mid, high); high--; break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
