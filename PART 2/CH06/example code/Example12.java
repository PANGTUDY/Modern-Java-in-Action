import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example12 {
    public static void main(String[] args) {
        
        Map<Dish.Type, Set<String>> dishNamesbyType = Dish.menu.stream()
                                                          .collect(Collectors.groupingBy(
                                                                 Dish::getType,
                                                                 Collectors.flatMapping(dish -> Dish.dishTags.get(dish.getName()).stream(), Collectors.toSet())
                                                             ));

        System.out.println(dishNamesbyType);
    }
}

