/* submit by 1FeS */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = sc.nextLine().split(" ");

        List<String> stringList = Arrays.asList(strings);

        int sum = stringList.stream()
                            .map(s -> Integer.parseInt(s))
                            .map(i -> i * i)
                            .reduce(0, Integer::sum);

        System.out.println(sum % 10);
    }
}