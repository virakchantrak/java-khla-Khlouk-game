import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        GameEngine gameEngine = new GameEngine(
                new DiceGenerator(),
                new PayoutCalculator()
        );

        GameRound gameRound = new GameRound();
        // Start the betting phase
        gameRound.startBetting();
        // Add bets for the round
        gameRound.addBet(new Bet(KhlaKhloukSymbol.TIGER, BigDecimal.valueOf(5))); // Bonat
        gameRound.addBet(new Bet(KhlaKhloukSymbol.CRAB, BigDecimal.TEN));// Virak
        // Start the rolling phase
        gameRound.startRolling();

        // Play the game round and get the result
        RoundResult result = gameEngine.play(gameRound);
        result.getBetResults().forEach(betResult -> System.out.printf(
                "Bet Symbol [%s] | Bet Amount [%s] | Matches [%d] | Profit [%s]%n",
                betResult.getBet().getSymbol(),
                betResult.getBet().getAmount(),
                betResult.getMatches(),
                betResult.getProfit()
        ));
    }
}