import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        Menu m = new Menu();

        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = m.menu.stream()
                                                                   .collect(
                                                                       Collectors.groupingBy(
                                                                           dish -> {
                                                                               if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                                                                               else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                                                                               else return CaloricLevel.FAT;
                                                                           }
                                                                       )
                                                                   );

        System.out.println(dishesByCaloricLevel);
    }

    public enum CaloricLevel {DIET, NORMAL, FAT};
}

