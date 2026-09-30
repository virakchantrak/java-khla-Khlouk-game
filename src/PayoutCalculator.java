import java.math.BigDecimal;

public class PayoutCalculator {

    public BigDecimal calculate(Bet bet, RollResult result) {
        int matches = result.getCounts().get(bet.getSymbol());

        return bet.getAmount()
                .multiply(BigDecimal.valueOf(matches));
    }
}
