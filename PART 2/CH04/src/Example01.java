import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import Dish;

public class Example01 {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fies", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH)
        );

        List<String> names = menu.stream().filter(dish -> {
            System.out.println("filtering: " + dish.getName());
            return dish.getCalories() > 300;
        }).map(dish -> {
            System.out.println("mapping: " + dish.getName());
            return dish.getName();
        }).limit(3).collect(toList());
        
        System.out.println(names);
    }
}