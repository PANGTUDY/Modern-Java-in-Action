import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example11 {
    public static void main(String[] args) {
        Map<Dish.Type, List<Dish>> caloricDishesByType = Dish.menu.stream()
                                                                  .collect(
                                                                      Collectors.groupingBy(
                                                                          Dish::getType,
                                                                          Collectors.filtering(dish -> dish.getCalories() > 500, Collectors.toList())
                                                                      )
                                                                  );

        System.out.println(caloricDishesByType);                                           
    }
}
