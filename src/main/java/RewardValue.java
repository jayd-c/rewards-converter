import java.math.BigDecimal;

public class RewardValue {
    private double cashValue;
    private int miles;
    private final double MILES_TO_CASH = 0.0035;

    public RewardValue(double cash) {
        this.cashValue = cash;
    }

    public RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public double getMilesValue() {
        return this.cashValue/MILES_TO_CASH;
    }
}
