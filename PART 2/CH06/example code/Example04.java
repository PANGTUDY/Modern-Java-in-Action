/* Listing 5.4 Returns a string of all traders' names sorted alphabetically */

import static java.util.stream.Collectors.joining;

public class Example04 {
    public static void main(String[] args) {
        TransactionDomain trd = new TransactionDomain();

        String names = trd.transactions.stream()
                                             .map(transaction -> transaction.getTrader().getName())
                                             .distinct()
                                             .sorted()
                                             .collect(joining(", "));
                                            //  .reduce("", (s1, s2) -> s1 + s2);

        System.out.println(names);
    }
}

