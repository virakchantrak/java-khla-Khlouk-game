import java.math.BigDecimal;

public class BetResult {

    private final Bet bet;
    private final int matches;
    private final BigDecimal profit;

    public BetResult(
            Bet bet,
            int matches,
            BigDecimal profit
    ) {
        this.bet = bet;
        this.matches = matches;
        this.profit = profit;
    }

    public Bet getBet() {
        return bet;
    }

    public int getMatches() {
        return matches;
    }

    public BigDecimal getProfit() {
        return profit;
    }
}