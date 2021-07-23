package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BOJ2475_heywon {
    public static List<Integer>calculate = new ArrayList<>();
    public static void save(){
        randomStream(10).collect(Collectors.toCollection(()->calculate));
    }
    public static void streamNumbers(){
        save();
        calculate.stream().
        forEach(System.out::print);
        
    }
    public static int streamSum(){
        streamNumbers();
        System.out.println(" ");
        int total = calculate.stream().map(n->n*n).reduce(0,Integer::sum);
        return total % 10;
    }
    public static Stream<Integer> randomStream(int range){
        return Stream.generate(Math::random).
        map(n-> (int)Math.floor(n * range))
        .limit(4);
    }
    public static void main(String[] args){
        
        System.out.println(" ");
        int total = streamSum();
        System.out.println(total);
    }
    
}
