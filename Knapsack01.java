/*
 *Mr. Rao is relocating from place A to B. The moving truck has a maximum capacity C. There are ‘N’ items in the house where each item has 
 a corresponding value (Vi) and weight(Wi).  Mr. Rao has to carry only the most valuable items whose total weight does not exceed 
 the capacity of truck. The task here is to find those items (single or combination of items) whose total value (v) will be the 
 maximum and their corresponding weight(w) will not exceed truck capacity(c). Here,

N= No. of items
C= Maximum capacity of the truck, an integer value,
W[0 to N-1]- An array consisting weight of each item
V[0 to N-1] – An array consisting value of each item.

 */
import java.util.*;

public class Knapsack01 {
    public static void main(String[] args) {
        // int[] v = {10,45,60,90};
        // int[] w = {15,20,30,40};

        // int[] v = {30, 40, 60};
        // int[] w = {3, 2, 7};
        // int c = 6;

        int[] v = {60, 40, 30};
        int[] w = {7, 2, 3};
        int c = 6;
        knapsack01(v, w, c);
        
    }

    public static void knapsack01(int[] v, int w[], int c) {
        int n = v.length;
        int dp[][] = new int[n][c+1];

        // for(int rows[]:dp)
        //     Arrays.fill(rows, -1);
        
        for(int cap=w[0]; cap<=c; cap++) {
            dp[0][cap] = v[0];
        }

        for(int i=1; i<n; i++) {
            for(int cap=0; cap<=c; cap++) {
                int notTake = dp[i-1][cap];
                int take = 0;
                if(w[i] <= cap)
                    take = v[i] + dp[i-1][cap-w[i]];

                dp[i][cap] = Math.max(notTake, take);
            }
        }

        for(int row[]:dp)
            System.out.println(Arrays.toString(row));
        // int ans = maxValue(n-1, v, w, c, dp);

        int ans = dp[n-1][c];
        System.out.println("Maximum Value: " + ans);
    }

    static int maxValue(int i, int[] v, int[] w, int c, int dp[][]) {
        if(c<=0) return 0;

        if(i == 0) {
            if(w[i] <= c) return v[i];
            return 0;
        }

        if(dp[i][c] != -1) return dp[i][c];
        int notTake = maxValue(i-1, v, w, c, dp);
        int take = 0;
        if(w[i] <= c)
            take = v[i] + maxValue(i-1, v, w, c-w[i], dp);

        return dp[i][c] = Math.max(notTake, take);
    }
}
