package it.unibo.pps.e1;

public class SilverBankAccount implements BankAccount {

    private final BankAccount bankAccount;
    private final CalculateFeeStrategy feeStrategy;
    private final CanWithdrawStrategy withdrawStrategy;

    public SilverBankAccount(BankAccount bankAccount, CalculateFeeStrategy feeStrategy, CanWithdrawStrategy withdrawStrategy) {
        this.bankAccount = bankAccount;
        this.feeStrategy = feeStrategy;
        this.withdrawStrategy = withdrawStrategy;
    }

    public int getBalance() {
        return bankAccount.getBalance();
    }

    public void deposit(int amount) {
        bankAccount.deposit(amount);
    }

    public void withdraw(int amount) {
        if (this.withdrawStrategy.canWithdraw(bankAccount.getBalance(), amount)){
            throw new IllegalStateException();
        }
        bankAccount.withdraw(amount + feeStrategy.calculateFee(amount));
    }
}
