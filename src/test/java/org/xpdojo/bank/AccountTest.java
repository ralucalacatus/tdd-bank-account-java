package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountShouldHaveZeroBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAmountsToIncreaseExistingBalance(){
        Account account = new Account();
        account.deposit(10);
        account.deposit(30);
        assertThat(account.balance()).isEqualTo(40);
    }

    @Test
    public  void  withdrawAnAmountToDecreaseTheBalance() {
        Account account = new Account();
        account.deposit(20);
        account.withdraw(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public  void  withdrawAmountRefused() {
        Account account = new Account();
        assertThat(account.withdraw(10)).isEqualTo(false);
    }

    @Test
    public void transferMoney(){
        Account a1 = new Account();
        Account a2 = new Account();

        a1.deposit(100);

        a1.withdraw(50);
        a2.deposit(50);
        assertThat((a1.balance())).isEqualTo(50);
        assertThat((a2.balance())).isEqualTo(50);
    }
}