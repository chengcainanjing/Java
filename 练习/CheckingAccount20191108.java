/**
 * This program demonstrates CheckingAccount类包含一个withdraw()方法，抛出InsufficientFundsException异常
 * @version 1.0 2019.11.08
 * @author chengcai
  */

import java.io.*;

// 此类模拟银行账户
public class CheckingAccount20191108 {
    // balance为余额,number为卡号
    private double balance;
    private int number;

    public CheckingAccount20191108(int number) {
        this.number = number;
    }

    // 方法：存钱
    public void deposit(double amount) {
        balance += amount;
    }

    // 方法：取钱
    public void withdraw(double amount) throws InsufficientFundsException20191108 {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException20191108 (needs);
        }
    }

    // 方法:返回余额
    public double getBalance() {
        return balance;
    }

    // 方法:返回卡号
    public int getNumber() {
        return number;
    }
}