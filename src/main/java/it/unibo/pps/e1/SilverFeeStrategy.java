package it.unibo.pps.e1;

public class SilverFeeStrategy implements CalculateFeeStrategy{
    @Override
    public int calculateFee(int amount) {
        return 1;
    }
}
