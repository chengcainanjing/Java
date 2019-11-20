/**
 * This program demonstrates 如何调用CheckingAccount类中deposit（）和withdraw（）方法
 * @version 1.0 2019.11.08
 * @author chengcai
  */

import java.io.*;

// 文件名称
public class BankDemo20191108 {
    public static void main(String[] args) {
        CheckingAccount20191108 c = new CheckingAccount20191108(101);
        System.out.println("Depositing $500...");
        c.deposit(500.00);
        try {
            System.out.println("\nWithDraw $100...");
            c.withdraw(100.00);
            System.out.println("\nWithDraw $600...");
            c.withdraw(600.00);
        } catch (InsufficientFundsException20191108 e) {
            System.out.println("Sorry, but you are short $" + e.getAmount());
            e.printStackTrace();
        }
    }
}