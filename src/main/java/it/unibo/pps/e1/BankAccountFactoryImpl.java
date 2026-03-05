package it.unibo.pps.e1;

public class BankAccountFactoryImpl implements BankAccountFactory{

    @Override
    public BankAccount createBronzeAccount() {
        return new SimpleBankAccount(new CoreBankAccount(),
                amount -> amount < 100 ? 0 : 1, (balance, withdrawAmount) -> balance < withdrawAmount);
    }

    @Override
    public BankAccount createSilverAccount() {
        return new SimpleBankAccount(new CoreBankAccount(),
                amount -> 1, (balance, withdrawAmount) -> balance < withdrawAmount);
    }

    @Override
    public BankAccount createGoldAccount() {
        return new SimpleBankAccount(new CoreBankAccount(),
                amount -> 0, (balance, withdrawAmount) -> balance < withdrawAmount - 500);
    }
}
