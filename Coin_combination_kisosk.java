/*
 * Possible combinations of the coins that can be inserted to get rupees from the kiosk.
A ‘coin vend’ kiosk is installed all the major metro stations The machine allows one to obtain cash of ‘R’ rupees in exchange for coins. 
The machine operates with the following conditions:

Only coins of denomination 1 rupee and 2 rupee can be exchanged.
Coins of denomination 2 rupees should not be inserted successively twice.
The task here to find all the possible combinations of the coins that can be inserted to get rupees from the kiosk.
 */

public class Coin_combination_kisosk {
    public static void main(String[] args) {
        int n = 6;
   
        int ans = kiosk(n);
        System.out.println(ans);
    }

    static int kiosk(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return kiosk(n - 1) + kiosk(n - 3);
    }

}
