package Problems;
import java.util.Scanner;

public class Java_Substring_Comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s;
        int res_largest, res_smallest;
        for(int i = 0; i < s.length() - k + 1; i++) {
            String sub_string = s.substring(i, i + k);
            res_largest = sub_string.compareTo(largest);
            res_smallest = sub_string.compareTo(smallest);
            if (res_smallest < 0) {
                smallest = sub_string;
            }
            if (res_largest > 0) {
                largest = sub_string;
            }

        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}