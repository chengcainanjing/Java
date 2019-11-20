/**
 * This program demonstrates 捕获异常，自定义异常类
 * @version 1.0 2019.11.08
 * @author chengcai
  */

import java.io.*;

// 自定义异常类，继承Exception类
public class InsufficientFundsException20191108 extends  Exception {
    // 此处的amount用来存储当出现异常（取出钱多于余额时）所缺乏的钱
    private double amount;

    public InsufficientFundsException20191108(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}