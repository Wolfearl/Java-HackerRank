package Problems;

import java.io.*;
import java.util.Map;
import java.util.HashMap;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        Map<Integer, String> weekday = new HashMap<>();
        weekday.put(0, "SATURDAY");
        weekday.put(1, "SUNDAY");
        weekday.put(2, "MONDAY");
        weekday.put(3, "TUESDAY");
        weekday.put(4, "WEDNESDAY");
        weekday.put(5, "THURSDAY");
        weekday.put(6, "FRIDAY");

        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }

        int century = year % 100;
        int yearInCentury = year / 100;

        int h = (day + (13 * (month + 1)) / 5 + century + (century / 4) + (yearInCentury / 4) + 5 * yearInCentury) % 7;

        return weekday.get(h);

    }

}

public class Java_Date_and_Time {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
