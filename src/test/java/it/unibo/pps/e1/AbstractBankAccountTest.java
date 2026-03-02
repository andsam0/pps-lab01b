package it.unibo.pps.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public abstract class AbstractBankAccountTest {

    protected BankAccount bankAccount;

    @Test
    void initiallyEmpty(){
        assertEquals(0, this.bankAccount.getBalance());
    }

    @Test
    public void testCanDeposit() {
        int amount = 100;
        this.bankAccount.deposit(amount);
        assertEquals(amount, this.bankAccount.getBalance());
    }

//    @Test
//    void canWithdraw(){
//        int initialAmount = 100;
//        this.bankAccount.deposit(initialAmount);
//        int withdrawAmount = 80;
//        this.bankAccount.withdraw(withdrawAmount);
//        assertEquals(initialAmount - withdrawAmount, this.bankAccount.getBalance());
//    }

//    @Test
//    public void cannotWithdrawMoreThanAvailable(){
//        int balanceAmount = 1000;
//        int bigWithdraw = 1200;
//        this.bankAccount.deposit(balanceAmount);
//        assertThrows(IllegalStateException.class, () -> this.bankAccount.withdraw(bigWithdraw));
//    }
}
