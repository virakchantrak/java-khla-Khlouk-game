import java.util.ArrayList;
import java.util.List;

public class GameRound {

    private final List<Bet> bets = new ArrayList<>();

    private GameRoundStatus status = GameRoundStatus.WAITING;
    private RollResult rollResult;

    public void startBetting() {
        if (status != GameRoundStatus.WAITING) {
            throw new IllegalStateException(
                    "Round is not ready for betting"
            );
        }

        status = GameRoundStatus.BETTING;
    }

    public void addBet(Bet bet) {
        if (status != GameRoundStatus.BETTING) {
            throw new IllegalStateException(
                    "Betting is closed"
            );
        }

        bets.add(bet);
    }

    public void startRolling() {
        if (status != GameRoundStatus.BETTING) {
            throw new IllegalStateException(
                    "Round is not accepting bets"
            );
        }

        status = GameRoundStatus.ROLLING;
    }

    public void setRollResult(RollResult rollResult) {
        if (status != GameRoundStatus.ROLLING) {
            throw new IllegalStateException(
                    "Round is not rolling"
            );
        }

        this.rollResult = rollResult;
        status = GameRoundStatus.RESULT;
    }

    public void finish() {
        if (status != GameRoundStatus.RESULT) {
            throw new IllegalStateException(
                    "Round is not ready to finish"
            );
        }

        status = GameRoundStatus.FINISHED;
    }

    public GameRoundStatus getStatus() {
        return status;
    }

    public List<Bet> getBets() {
        return List.copyOf(bets);
    }

    public RollResult getRollResult() {
        return rollResult;
    }
}