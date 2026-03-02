package it.unibo.pps.e1;

public class SilverBankAccount implements BankAccount {

    private final BankAccount bankAccount;
    private final CalculateFeeStrategy feeStrategy;

    public SilverBankAccount(BankAccount bankAccount, CalculateFeeStrategy feeStrategy) {
        this.bankAccount = bankAccount;
        this.feeStrategy = feeStrategy;
    }

    public int getBalance() {
        return bankAccount.getBalance();
    }

    public void deposit(int amount) {
        bankAccount.deposit(amount);
    }

    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        bankAccount.withdraw(amount + feeStrategy.calculateFee(amount));
    }
}
