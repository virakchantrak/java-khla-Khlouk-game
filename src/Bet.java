import java.math.BigDecimal;

public class Bet {

    private final KhlaKhloukSymbol symbol;
    private final BigDecimal amount;

    public Bet(KhlaKhloukSymbol symbol, BigDecimal amount) {
        this.symbol = symbol;
        this.amount = amount;
    }

    public KhlaKhloukSymbol getSymbol() {
        return symbol;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
