import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> serial = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<5; i++) {
            serial.add(sc.nextInt());
        }

        int evaluationNum = serial.stream()
                .mapToInt(i->i*i)
                .sum();

        System.out.println(evaluationNum % 10);
    }
}
