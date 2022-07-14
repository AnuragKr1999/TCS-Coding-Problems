
/*
 In a Conference ,attendees are invited for a dinner after the conference.The Co-ordinator,Sagar arranged around round tables for dinner and 
 want to have an impactful seating experience for the attendees.Before finalizing the seating arrangement,he wants to analyze all the 
 possible arrangements.These are R round tables and N attendees.In case where N is an exact multiple of R,the number of attendees must be 
 exactly N//R,,If N is not an exact multiple of R, then the distribution of attendees must be as equal as possible.Please refer to the example 
 section before for better understanding.
For example, R = 2 and N = 3
All possible seating arrangements are
(1,2) & (3)
(1,3) & (2)
(2,3) & (1)
Attendees are numbered from 1 to N.
 */


public class Dinner_combination {
    public static void main(String args[]) {
        int N = 10;
        int R = 2;

        int x = N/R;
        int x1 = 0;
        int y1 = N%R;
        int ans = 1;

        while(R-- != 0) {
            if(y1 > 0) {
                x1 = x+1;
                y1--;
            } else {
                x1 = x;
            }
            ans = ans*nCr(N, x1);
            N = N-x1;

        }
        System.out.println(ans);
    }

    static int nCr(int n, int r) {
        int factn = fact(n);
        int factr = fact(r);
        int factn_r = fact(n-r);
        int ncr = factn/(factr*factn_r);
        return ncr;
    }

    static int fact(int n) {
        int sum = 1;
        for(int i=1; i<=n; i++)
            sum *= i;

        return sum;
    }
}


