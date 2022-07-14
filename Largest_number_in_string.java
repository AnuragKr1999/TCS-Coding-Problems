/*
 * 
 * Find the largest number in a string of words and numbers which does not contain 9.
 * input: This is alpha 5057 and 97 
 * Output: 5057 
 */

public class Largest_number_in_string {
    public static void main(String[] args) {
        
        String str = "This is alpha 50 and 1000 and 990123 and 2345";
        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;

        for(int i=0; i<str.length(); i++) {

            //if a digit is encountered
            if(Character.isDigit(str.charAt(i))) {
                boolean flag = true;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    sb.append(str.charAt(i));
                    
                    if (str.charAt(i) == '9') {
                        flag = false;
                        break;
                    }
                    i++;
                }

                if(flag) {
                    int n = Integer.parseInt(sb.toString());
                    max = Math.max(max, n);
                }

                sb.delete(0, sb.length());
            }
        }

        if(max  == 0)
            System.out.println("NOT FOUND");
        else
            System.out.println(max);
    }
}
