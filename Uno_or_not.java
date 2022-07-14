/*
 * Given a positive integer number N, reduce the number of digits of N by computing the sum of all the digits to get a new number. 
 * If this new number exceeds 9, then sum the digits of this new number to get another number and continue this way until a single digit value
 *  is obtained as the ‘digit sum’. The task here is to find out whether the result of the digit sum done this way is ‘1’ or not. 
 * If the result is 1 return UNO else not.
 */

public class Uno_or_not {
    public static void main(String[] args) {
        int n = 235;

        while(n > 9) {

            int sum = 0;
            while(n > 0) {
                sum += n%10;
                n = n/10;
            }
            n = sum;

        }

        if(n == 1)
            System.out.println("UNO");
        else
            System.err.println("NOT UNO");
    }
}
