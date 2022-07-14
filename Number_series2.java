/*
 *  Find the nth term of the series.

    1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243,64, 729, 128, 2187 ….
 */

public class Number_series2 {
    public static void main(String[] args) {
        int n = 11;

        int x = n/2;

        
        if(n%2 == 0) {
            System.out.println(Math.pow(3, x-1));
        } else {
            System.out.println(Math.pow(2, x));
        }
        printSeries(n);
    }

    static void printSeries(int n) {
        System.out.println("The series till N is: ");
        for(int i=1; i<=n; i++) {
            int x = i/2;
            if(i%2 == 0) {
                System.out.print(Math.pow(3, x-1) + ", ");
            } else {
                System.out.print(Math.pow(2, x) + ", ");
            }
        }
    }
}
