import java.util.ArrayList;
import java.util.List;

public class GameEngine {

    private final DiceGenerator diceGenerator;
    private final PayoutCalculator payoutCalculator;

    public GameEngine(
            DiceGenerator diceGenerator,
            PayoutCalculator payoutCalculator
    ) {
        this.diceGenerator = diceGenerator;
        this.payoutCalculator = payoutCalculator;
    }

    public RoundResult play(GameRound round) {

        RollResult rollResult = diceGenerator.roll();

        round.setRollResult(rollResult);

        List<BetResult> results = new ArrayList<>();

        for (Bet bet : round.getBets()) {

            int matches = rollResult
                    .getCounts()
                    .get(bet.getSymbol());

            var profit = payoutCalculator.calculate(
                    bet,
                    rollResult
            );

            results.add(
                    new BetResult(
                            bet,
                            matches,
                            profit
                    )
            );
        }

        return new RoundResult(
                rollResult,
                results
        );
    }
}