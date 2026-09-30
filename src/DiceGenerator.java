import java.security.SecureRandom;

public class DiceGenerator {
    private final SecureRandom random = new SecureRandom();

    public RollResult roll() {
        return new RollResult(
                rollDice(),
                rollDice(),
                rollDice()
        );
    }

    private KhlaKhloukSymbol rollDice() {
        KhlaKhloukSymbol[] symbols = KhlaKhloukSymbol.values();

        return symbols[random.nextInt(symbols.length)];
    }
}
