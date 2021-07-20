/* Listing 5.5 Are any traders based in Millan? */

public class Example05 {
    public static void main(String[] args) {
        TransactionDomain trd = new TransactionDomain();

        boolean millan = trd.transactions.stream()
                                         .anyMatch(transaction -> transaction.getTrader()
                                                                             .getCity()
                                                                             .equals("Milan"));

        System.out.println(millan);
    }
}
