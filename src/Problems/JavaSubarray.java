package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] A = new int[n];
        String line = scanner.nextLine();
        String[] parts = line.split(" ");
        scanner.close();
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(parts[i]);
        }
        int j, count = 0;
        for (int i = 0; i < n; i++) {
            j = i + 1;
            while (j < n + 1) {
                if (Arrays.stream(Arrays.copyOfRange(A, i, j)).sum() < 0) {
                    count++;
                }
                j++;
            }
        }
        System.out.println(count);
    }
}
