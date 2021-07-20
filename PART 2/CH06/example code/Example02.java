/* Listing 5.2 What are all the unique cities where the traders work? */

import java.util.List;
import static java.util.stream.Collectors.toList;

public class Example02 {
    public static void main(String[] args) {
        TransactionDomain trDomain = new TransactionDomain();

        List<String> cities = trDomain.transactions.stream()
                                                   .map(transaction -> transaction.getTrader().getCity())
                                                   .distinct()
                                                   .collect(toList());
        
        System.out.println(cities);
    }
}


