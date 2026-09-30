import java.math.BigDecimal;

public class GameResult {

    private final RollResult rollResult;
    private final Bet bet;
    private final BigDecimal profit;

    public GameResult(
            RollResult rollResult,
            Bet bet,
            BigDecimal profit
    ) {
        this.rollResult = rollResult;
        this.bet = bet;
        this.profit = profit;
    }

    public RollResult getRollResult() {
        return rollResult;
    }

    public Bet getBet() {
        return bet;
    }

    public BigDecimal getProfit() {
        return profit;
    }
}