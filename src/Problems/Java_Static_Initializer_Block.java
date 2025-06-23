package Problems;

import java.util.Scanner;

public class Java_Static_Initializer_Block {

    static int B, H;
    static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();
        if(B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if(flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
