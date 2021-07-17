/* submit by 1FeS */

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] parsedInt = sc.nextLine().split(" ");
        int totalSum = 0;
        for (String i : parsedInt) {
            totalSum += Math.pow(Integer.parseInt(i), 2);
        }

        System.out.println(totalSum % 10);
    }
}
