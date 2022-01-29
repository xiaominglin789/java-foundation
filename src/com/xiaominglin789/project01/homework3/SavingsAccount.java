package com.xiaominglin789.project01.homework3;

/**
 * 有利息分红
 */
public class SavingsAccount extends BankAccount {
    private int count=3; // 每月3次存取钱免手续费
    private double radius=0.001; // 月利息
    private double commission=1; // 存取钱手续费:1元

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void resetCount() {
        setCount(3);
    }

    /**
     * 每月利息加成,重置每月免息操作次数
     */
    public void earnMonthlyInterest() {
        // 本次操作免手续费
        resetCount();
        // 利息存进余额
        super.deposit(getBalance() * getRadius());
        // 本月重置操作免手续费的次数
        resetCount();
    }

    @Override
    public void deposit(double amount) {
        System.out.println(getCount());
        if (getCount() > 0) {
            super.deposit(amount);
            count--;
            return;
        }
        // 超过3次 存钱扣手续费
        super.deposit(amount);
        super.withdraw(getCommission());
    }

    @Override
    public void withdraw(double amount) {
        if (getCount() > 0) {
            super.withdraw(amount);
            count--;
            return;
        }
        // 超过3次 取钱扣手续费
        if (getBalance() < (amount + getCommission())) {
            System.out.println("余额不足");
            return;
        }
        super.withdraw(amount);
        super.withdraw(getCommission());
    }
}
