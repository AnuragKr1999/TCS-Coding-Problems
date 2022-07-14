/*
 A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array arrt of N number of integer values. 
 The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
*/
import java.util.*;
public class Push_0_toEnd {
    public static void main(String args[]) {
        int arr[] = {4, 5, 0, 1, 0, 0, 5};
        System.out.println("Array: " + Arrays.toString(arr));
        pushToEnd(arr, arr.length);

        
        System.out.println("New Array: " + Arrays.toString(arr));

    }

    public static int[] pushToEnd(int arr[], int n) {
        int count = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        for(int i=count; i<n; i++)
            arr[i] = 0;
            
        return arr;
    }
}
