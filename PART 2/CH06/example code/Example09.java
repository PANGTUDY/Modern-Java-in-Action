import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class Example09 {
    public static void main(String[] args) {
        Menu m = new Menu();

        Map<Dish.Type, List<Dish>> dishesByType = m.menu.stream()
                                                        .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishesByType);
    }
}


