import java.util.Arrays;
import java.util.List;

import Trader;
import Transaction;

public class TransactionDomain {
    private Trader raoul = new Trader("Raoul", "Cambridge");
    private Trader mario = new Trader("Mario", "Milan");
    private Trader alan = new Trader("Alan", "Cambridge");
    private Trader brian = new Trader("Brian", "Cambridge");

    public List<Transaction> transactions = Arrays.asList(
        new Transaction(this.brian, 2011, 300),
        new Transaction(this.raoul, 2012, 1000),
        new Transaction(this.raoul, 2011, 400),
        new Transaction(this.mario, 2012, 710),
        new Transaction(this.mario, 2012, 700),
        new Transaction(this.alan, 2012, 950)
    );
}
