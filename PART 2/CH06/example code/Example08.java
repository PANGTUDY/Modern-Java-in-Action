/* Listing 5.8 Finds the transaction with the smallest value */
import java.util.Optional;

public class Example08 {
    public static void main(String[] args) {
        TransactionDomain trd = new TransactionDomain();

        Optional<Transaction> smallestTr = trd.transactions.stream()
                                                          .reduce((tr1, tr2) ->
                                                                    tr1.getValue() < tr2.getValue() ? tr1 : tr2);

        System.out.println(smallestTr);
    }
}

