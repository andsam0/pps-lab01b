package it.unibo.pps.e1;

public interface BankAccountFactory {

    public BankAccount createBronzeAccount();

    public BankAccount createSilverAccount();

    public BankAccount createGoldAccount();
}
