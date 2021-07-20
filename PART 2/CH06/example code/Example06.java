/* Listing 5.6 Prints all transactions' values from the traders living in Cambridge */

public class Example06 {
    public static void main(String[] args) {
        TransactionDomain trd = new TransactionDomain();

        trd.transactions.stream()
                        .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                        .map(Transaction::getValue)
                        .forEach(System.out::println);
    }
}
