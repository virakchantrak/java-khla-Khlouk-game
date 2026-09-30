import java.util.List;

public class RoundResult {

    private final RollResult rollResult;
    private final List<BetResult> betResults;

    public RoundResult(
            RollResult rollResult,
            List<BetResult> betResults
    ) {
        this.rollResult = rollResult;
        this.betResults = betResults;
    }

    public RollResult getRollResult() {
        return rollResult;
    }

    public List<BetResult> getBetResults() {
        return betResults;
    }
}