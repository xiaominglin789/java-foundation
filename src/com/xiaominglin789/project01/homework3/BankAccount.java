package com.xiaominglin789.project01.homework3;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * 存钱
     * @param amount
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            return;
        }
        balance += amount;
        // 日志
        System.out.println("存入: " + amount);
    }

    /**
     * 取钱
     * @param amount
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            return;
        }
        if (balance - amount < 0) {
            System.out.println("已经没有那么多钱了");
            return;
        }
        balance -= amount;
        // 日志
        System.out.println("取出: " + amount);
    }

    /**
     * 显示余数
     */
    public void showBalance() {
        System.out.println("余额: " + getBalance());
    }
}
