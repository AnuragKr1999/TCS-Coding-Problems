/*
 * Given a signed integer n, print the reverse of the number with its sign.
 * If the value of the number reversed is outside the signed int boundary(-32,768 to +32,767), then print 'Not Possible'
 */

public class Reverse_number {
    public static void main(String[] args) {
        int n = -50340;
        int x = Math.abs(n);
        StringBuilder sb = new StringBuilder();

        while(x > 0) {
            sb.append(x%10);
            x = x/10;
        }
    
        while(true) {
            if(sb.length()>1 && sb.charAt(0) == '0')
                sb.deleteCharAt(0);
            else
                break;
        }

        if(n<0)
            sb.insert(0, '-');
        
        Long l = Long.parseLong(sb.toString());

        if(l <= -32768 && l >= 32767) {
            System.out.println("Not Possible");
        } else {
            System.out.println(sb.toString());
        }
    }
}
