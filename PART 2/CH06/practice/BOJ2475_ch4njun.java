import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.stream(sc.nextLine().split(" "))
                                .map(Integer::parseInt).mapToInt(it -> it * it)
                                .sum() % 10);
    }
}
