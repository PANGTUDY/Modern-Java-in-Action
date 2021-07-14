import java.util.stream.IntStream;

public class Example10 {
    public static void main(String[] args) {
        IntStream evenNumbers1 = IntStream.rangeClosed(2, 100)
                                          .filter(n -> n % 2 == 0);
        IntStream evenNumbers2 = IntStream.range(2, 100)
                                          .filter(n -> n % 2 == 0);                                  
        System.out.println(evenNumbers1.count());
        System.out.println(evenNumbers2.count());
    }
}