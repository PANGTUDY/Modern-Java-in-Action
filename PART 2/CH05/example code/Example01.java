// Quiz 5.2: Mappings

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Example01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                                       .map(n -> n * n)
                                       .collect(toList());

        System.out.println(squares);   
    }
}
