/* Listing 5.7 What's the highest value of all the transactions?*/

import java.util.Optional;
import java.util.OptionalInt;

public class Example07 {
    public static void main(String[] args) {
        TransactionDomain trd = new TransactionDomain();

        Optional<Integer> highestValue = trd.transactions.stream()
                                                         .map(Transaction::getValue)
                                                         .reduce(Integer::max);
        System.out.println(highestValue);

        OptionalInt highestValue2 = trd.transactions.stream()
                                            .mapToInt(Transaction::getValue)
                                            .max();
        System.out.println(highestValue2);
                                                         
    }
}

