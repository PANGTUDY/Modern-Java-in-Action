// Quiz 5.2: Mappings

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Example02 {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        
        // flatMap 을 사용해 여러 Stream을 한 개의 단일 Stream으로 변환
        List<int []> pairs = numbers1.stream()
                                     .flatMap(
            i -> numbers2.stream().map(j -> new int[]{i,j})
        )
        .collect(toList());

        pairs.forEach(p -> System.out.println(
            Integer.toString(p[0]) + " " + Integer.toString(p[1])
        ));
        
        // map 을 사용했을 때, 3개의 stream 이 반환되는 것을 알 수 있음
        List<Stream<int []>> pairs2 = numbers1.stream()
                                     .map(i-> numbers2.stream().map(j -> new int[] {i, j}))
                                     .collect(toList());

        pairs2.forEach(p -> System.out.println(p));              
    }
}
