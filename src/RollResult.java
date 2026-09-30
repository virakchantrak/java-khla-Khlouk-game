import java.util.EnumMap;
import java.util.Map;

public class RollResult {

    private final KhlaKhloukSymbol dice1;
    private final KhlaKhloukSymbol dice2;
    private final KhlaKhloukSymbol dice3;

    public RollResult(
            KhlaKhloukSymbol dice1,
            KhlaKhloukSymbol dice2,
            KhlaKhloukSymbol dice3
    ) {
        this.dice1 = dice1;
        this.dice2 = dice2;
        this.dice3 = dice3;
    }

    public KhlaKhloukSymbol getDice1() {
        return dice1;
    }

    public KhlaKhloukSymbol getDice2() {
        return dice2;
    }

    public KhlaKhloukSymbol getDice3() {
        return dice3;
    }

    public Map<KhlaKhloukSymbol, Integer> getCounts() {
        Map<KhlaKhloukSymbol, Integer> counts =
                new EnumMap<>(KhlaKhloukSymbol.class);

        for (KhlaKhloukSymbol symbol : KhlaKhloukSymbol.values()) {
            counts.put(symbol, 0);
        }

        counts.merge(dice1, 1, Integer::sum);
        counts.merge(dice2, 1, Integer::sum);
        counts.merge(dice3, 1, Integer::sum);

        return counts;
    }
}
