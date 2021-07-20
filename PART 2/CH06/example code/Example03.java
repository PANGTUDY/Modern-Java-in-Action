/* Listing 5.3 Finds all traders from Cambridge and sort them by name */

import java.util.List;
import static java.util.stream.Collectors.toList;

import java.util.Comparator;

public class Example03 {
    public static void main(String[] args) {
        TransactionDomain trd = new TransactionDomain();

        List<Trader> traders = trd.transactions.stream()
                                               .map(Transaction::getTrader)
                                               .filter(trader -> trader.getCity().equals("Cambridge"))
                                               .sorted(Comparator.comparing(Trader::getName))
                                               .collect(toList());

        System.out.println(traders);
    }
}
