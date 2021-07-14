import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Reducing

public class Example07 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 6, 1, 2, 3);

        int sumNum = numbers.stream().reduce(0, Integer::sum);
        Optional<Integer> maxNum = numbers.stream().reduce(Integer::max);
        Optional<Integer> minNum = numbers.stream().reduce(Integer::min);

        System.out.println(sumNum);
        System.out.println(maxNum.get());
        System.out.println(minNum.get());
    }
}
