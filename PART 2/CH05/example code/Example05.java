/* Optional Class example */
/*
    Method
     - isPresent()
     - ifPresent()
     - T get()
     - T orElse(T other)
*/

import Dish;
import Menu;

public class Example05 {
    public static void main(String[] args) {
        Menu m = new Menu();

        // isPresent
        m.menu.stream()
              .filter(Dish::isVegetarian)
              .findAny()
              .ifPresent(dish -> System.out.println(dish.getName()));
    }
}
