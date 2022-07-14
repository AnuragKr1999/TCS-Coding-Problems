public class Check_3_palindrome {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        check3palindrome(str);
    }

    static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String str = new String(sb);
        return s.equals(str);
    }

    static void check3palindrome(String str) {

        int len = str.length ();
        String str1 = "", str2 = "", str3 = "";

        boolean flag = false;
    
        for (int i = 1; i < len - 1; i++)
        {
	
            str1 = str.substring (0, i);
            if (isPalindrome (str1))
        	{
                for (int j = 1; j < len - i; j++)
        	    {
		            str2 = str.substring (i, i + j);
                    str3 = str.substring (i + j, len);
                    System.out.println (str1 + " " + str2 + " " + str3);
                    if (isPalindrome (str2) && isPalindrome (str3))
            		{
                        System.out.println (str1 + "\n" + str2 + "\n" + str3);
                        flag = true;
                        break;
                    }
                }
                if (flag)
                    break;
            }
        }
        if (flag == false)
            System.out.println ("Impossible");
    }
}
