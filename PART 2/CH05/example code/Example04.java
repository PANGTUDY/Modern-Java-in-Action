/* 
    findAny 
     - returns an arbitary element of the current stream
     - pipeline will be optimized behind the scenes to perform a single pass and finish as soon as a result is found
*/

import Menu;
import java.util.Optional;
import static java.util.stream.Collectors.toList;
import Dish;

public class Example04 {
    public static void main(String[] args) {
        Menu m = new Menu();
        Optional<Dish> dish = m.menu.stream()
                                    .filter(Dish::isVegetarian)
                                    .findAny();
        
        // findAny make shor-cut
        System.out.println(dish);

        // same result with limit(1)
        System.out.println(m.menu.stream().filter(Dish::isVegetarian).limit(1).collect(toList()));
    }
}