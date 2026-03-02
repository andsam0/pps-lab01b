package it.unibo.pps.e1;

public class BankAccountFactoryImpl implements BankAccountFactory{

    @Override
    public BankAccount createBronzeAccount() {
        return new BronzeBankAccount(new CoreBankAccount(), amount -> amount < 100 ? 0 : 1);
    }

    @Override
    public BankAccount createSilverAccount() {
        return new SilverBankAccount(new CoreBankAccount(), amount -> 1);
    }

    @Override
    public BankAccount createGoldAccount() {
        return new GoldBankAccount(new CoreBankAccount(), amount -> 0);
    }
}
