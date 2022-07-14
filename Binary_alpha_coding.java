
public class Binary_alpha_coding {

    
    public static void main(String[] args) {
        String binaryCode = "1010101011110000"; // String length should only be a multiple pf 4
        int n = binaryCode.length();

        String alpha = "abcdefghijklmnop";
        String ans = "";
       
        for(int i=0; i<n; i+=4) {
            ans += decoder(i, binaryCode, alpha, 4);
        }

        System.out.println(ans);

    }

    static String decoder(int i, String binaryCode, String abcd, int count) {
        if(count == 0) {
            return abcd;
        }

        if(binaryCode.charAt(i) == '0')
            return decoder(i+1, binaryCode, abcd.substring(0, abcd.length()/2), count-1);
        else
            return decoder(i+1, binaryCode, abcd.substring(abcd.length()/2, abcd.length()), count-1);
    }
}
