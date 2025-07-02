package Problems;

import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if (lenA != lenB) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int lenAlpha = alphabet.length;
        int[] countA = new int[lenAlpha];
        int[] countB = new int[lenAlpha];
        int timer = 0;
        for (int i = 0; i < lenA; i++) {
            char cA = a.charAt(i);
            char cB = b.charAt(i);
            for (int j = 0; j < lenAlpha; j++) {
                if (cA == alphabet[j]) {
                    countA[j]++;
                    timer++;
                }
                if (cB == alphabet[j]) {
                    countB[j]++;
                    timer++;
                }
                if (timer == 2) {
                    timer = 0;
                    break;
                }
            }
        }
        for (int i = 0; i < countA.length; i++) {
            if (countA[i] != countB[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
