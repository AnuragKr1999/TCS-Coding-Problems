/*
 Given N gold wires, each wire has a length associated with it. At a time, only two adjacent small wires are assembled at the end of a large 
 wire and the cost of forming is the sum of their length. Find the minimum cost when all wires are assembled to form a single wire.
 */

 import java.util.*;

public class Minimum_Cost_of_Wires {
    public static void main(String[] args) {
        int wires[] = {4, 3, 2, 6};
        int n = wires.length;
        int cost = minCost(wires, n);
        System.out.println("Given wires: " + Arrays.toString(wires));
        System.out.println("Minimum cost: " + cost);

    }

    static int minCost(int[] arr, int n) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int minSum = 0, temp1, temp2;
        
        for(int i=0; i<n; i++)
            pq.add(arr[i]);
        
        while(pq.size() >= 2) {
            temp1 = pq.poll();
            temp2 = pq.poll();
            pq.add(temp1 + temp2);
            minSum += temp1 + temp2;
        }
        
        return minSum;
    }
}
