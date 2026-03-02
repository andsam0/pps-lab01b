package it.unibo.pps.e1;

public class BronzeFeeStrategy implements CalculateFeeStrategy {
    @Override
    public int calculateFee(int amount) {
        return amount < 100 ? 0 : 1;
    }
}
