package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoldBankAccountTest extends AbstractBankAccountTest {

    @BeforeEach
    void init(){
        BankAccountFactory factory = new BankAccountFactoryImpl();
        this.bankAccount = factory.createGoldAccount();
    }

    @Test
    public void canWithdraw() {
        int balance = 100;
        int withdraw = 20;
        this.bankAccount.deposit(balance);
        this.bankAccount.withdraw(withdraw);
        assertEquals(balance-withdraw, this.bankAccount.getBalance());
    }
}
