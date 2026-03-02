package it.unibo.pps.e1;

public class BronzeBankAccount implements BankAccount {

    private final BankAccount bankAccount;
    private final CalculateFeeStrategy feeStrategy;
    private final CanWithdrawStrategy withdrawStrateg;

    public BronzeBankAccount(BankAccount bankAccount, CalculateFeeStrategy feeStrategy, CanWithdrawStrategy withdrawStrategy) {
        this.bankAccount = bankAccount;
        this.feeStrategy = feeStrategy;
        this.withdrawStrateg = withdrawStrategy;
    }

    public int getBalance() {
        return bankAccount.getBalance();
    }

    public void deposit(int amount) {
        bankAccount.deposit(amount);
    }

    public void withdraw(int amount) {
        if (this.withdrawStrateg.canWithdraw(bankAccount.getBalance(), amount)){
            throw new IllegalStateException();
        }
        bankAccount.withdraw(amount + feeStrategy.calculateFee(amount));
    }
}
