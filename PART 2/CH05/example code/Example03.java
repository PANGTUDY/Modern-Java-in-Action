/*

- allMatch: true if a predicate mathces all elements
- anyMatch: true if a predicate matches any elements
- noneMatch: true if a predicate matches nothing at all

*/
 

import Menu;

public class Example03 {
    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean isHealthy = menu.menu.stream()
                                     .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);
    }
}
