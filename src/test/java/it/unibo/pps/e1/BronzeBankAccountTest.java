package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BronzeBankAccountTest extends AbstractBankAccountTest{

    @BeforeEach
    void init(){
        BankAccountFactory factory = new BankAccountFactoryImpl();
        this.bankAccount = factory.createBronzeAccount();
    }

    @Test
    public void canWithdrawWithoutFee(){
        int initialAmount = 100;
        this.bankAccount.deposit(initialAmount);
        int withdrawAmount = 80;
        this.bankAccount.withdraw(withdrawAmount);
        assertEquals(initialAmount - withdrawAmount, this.bankAccount.getBalance());
    }

    @Test
    public void canWithdrawWithFee(){
        int expectedFee = 1;
        int initialAmount = 200;
        this.bankAccount.deposit(initialAmount);
        int withdrawAmount = 120;
        this.bankAccount.withdraw(withdrawAmount);
        assertEquals(initialAmount - withdrawAmount - expectedFee, this.bankAccount.getBalance());
    }
}
