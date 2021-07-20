/* Listing 5.1 Finds all transactions in 2011 and sort by value (ascending order) */

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;

public class Example01 {
    public static void main(String[] args) {
        TransactionDomain trDomain = new TransactionDomain();

        List<Transaction> tr2011 = trDomain.transactions.stream()
                                                        .filter(transaction -> transaction.getYear() == 2011)
                                                        .sorted(Comparator.comparing(Transaction::getValue))
                                                        .collect(toList());
        System.out.println(tr2011);
    }
}
