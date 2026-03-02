package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SilverBankAccountTest extends AbstractBankAccountTest{

    @BeforeEach
    void init(){
        this.bankAccount = new SilverBankAccount(new CoreBankAccount(), new SilverFeeStrategy());
    }

    @Test
    public void canWithdraw() {
        int balance = 100;
        int withdraw = 20;
        int silverFee = 1;
        this.bankAccount.deposit(balance);
        this.bankAccount.withdraw(withdraw);
        assertEquals(balance-withdraw-silverFee, this.bankAccount.getBalance());
    }
}
