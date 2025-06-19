package Problems;

import java.util.Scanner;

public class Java_Loops_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int current_result;
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            current_result = a;
            for(int j = 0; j < n; j++) {
                current_result += (int) (Math.pow(2, j) * b);
                if(j + 1 == n) {
                    System.out.println(current_result);
                } else {
                    System.out.print(current_result + " ");
                }
            }
        }
        in.close();
    }
}
