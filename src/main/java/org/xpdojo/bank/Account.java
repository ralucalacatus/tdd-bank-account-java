package org.xpdojo.bank;

public class Account {
    private int balance = 0;
    public int balance() {
        return balance;
    }

    public void deposit(int depositedAmount) {
        balance += depositedAmount;
    }

    public boolean withdraw(int amount) {
        if(balance<amount){
           return  false;
        }else {
            balance -= amount;
            return true;
        }
    }

}