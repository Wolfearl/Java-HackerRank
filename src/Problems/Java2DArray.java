package Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Java2DArray {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        try {
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int max_sum = Integer.MIN_VALUE;
        if (!arr.isEmpty()) {
            int i = 0, j = 0;
            int sum;
            int size_rows = arr.size(), size_cols = arr.get(0).size();
            while (i < size_rows) {
                if ((i + 2) < size_rows && (j + 2) < size_cols) {
                    sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) +
                            arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                    if (sum > max_sum) {
                        max_sum = sum;
                    }
                    j += 1;
                } else {
                    i += 1;
                    j = 0;
                }
            }
        }
        System.out.println(max_sum);
    }
}
