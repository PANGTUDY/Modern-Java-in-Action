/* Quiz 5.3: Reducing */

import javax.print.event.PrintJobListener;

import Dish;
import Menu;

public class Example08{
    public static void main(String[] args) {
        Menu m = new Menu();
        int count = m.menu.stream()
                          .map(dish -> 1)
                          .reduce(0, Integer::sum);

        System.out.println(count);
    }
}