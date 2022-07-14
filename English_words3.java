/*
Problem:
  The program will recieve 3 English words inputs from STDIN

    These three words will be read one at a time, in three separate line
    The first word should be changed like all vowels should be replaced by *
    The second word should be changed like all consonants should be replaced by @
    The third word should be changed like all char should be converted to upper case
    Then concatenate the three words and print them
 */

import java.util.*;

public class English_words3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();

        words(word1, word2, word3);
    }

    static void words(String w1, String w2, String w3) {
        
        for(int i=0; i<w1.length(); i++) {
            char c = Character.toLowerCase(w1.charAt(i));

            if(Character.isAlphabetic(c)) {
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    w1 = w1.replace(w1.charAt(i), '*');
            }
        }

        for(int i=0; i<w2.length(); i++) {
            char c = Character.toLowerCase(w2.charAt(i));

            if(Character.isAlphabetic(c)) {
                if(c !='a' && c != 'e' && c != 'i' & c != 'o' && c != 'u')
                    w2 = w2.replace(w2.charAt(i), '@');
            }
        }

        w3 = w3.toUpperCase();

        System.out.println(w1+w2+w3);
    }
}
