package Problems;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String reverseA = new StringBuilder(A).reverse().toString();
        System.out.println(A.equals(reverseA) ? "Yes" : "No");
    }
}
