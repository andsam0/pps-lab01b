package it.unibo.pps.e1;

public class GoldBankAccount implements BankAccount {

    private final BankAccount bankAccount;
    private final CalculateFeeStrategy feeStrategy;

    public GoldBankAccount(BankAccount bankAccount, CalculateFeeStrategy feeStrategy) {
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
        if (this.getBalance() < amount-500){
            throw new IllegalStateException();
        }
        bankAccount.withdraw(amount + feeStrategy.calculateFee(amount));
    }
}
