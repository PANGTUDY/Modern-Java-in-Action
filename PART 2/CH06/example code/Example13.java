import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example13 {
    public static void main(String[] args) {
        Map<Boolean, List<Dish>> partitionedMenu = Dish.menu.stream()
                                                            .collect(
                                                                Collectors.partitioningBy(
                                                                    Dish::isVegetarian
                                                                )
                                                            );
        List<Dish> vegeterianDishes = partitionedMenu.get(true);
        System.out.println(vegeterianDishes);
    }
}
