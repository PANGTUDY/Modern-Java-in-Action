/* Avoiding hidden boxing costs by using primitive stream specializations */
/* 
    - mapToInt, mapToLong, mapToDouble
    - OptionalInt., etc for optional return data type
*/
import java.util.OptionalInt;

import Dish;
import Menu;

public class Example09 {
    public static void main(String[] args) {
        Menu m = new Menu();
        int calories = m.menu.stream()
                             .mapToInt(Dish::getCalories)
                             .sum();
        
        OptionalInt maxCalories = m.menu.stream()
                                        .mapToInt(Dish::getCalories)
                                        .max();

        System.out.println(calories);
        System.out.println(maxCalories);
    }
}
