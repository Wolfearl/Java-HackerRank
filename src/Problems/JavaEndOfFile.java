package Problems;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (scanner.hasNext()) {
            System.out.printf("%d %s\n", i, scanner.nextLine());
            i++;
        }
    }
}
