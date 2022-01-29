package com.xiaominglin789.project01.homework3;

/**
 * 每次存、取钱都收手续费: 1美元
 */
public class CheckingAccount extends BankAccount {
    private double commission=1;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        // 存钱扣搜续费
        super.withdraw(getCommission());
    }

    @Override
    public void withdraw(double amount) {
        // 不够没钱扣了
        if (getBalance() < (amount + getCommission())) {
            System.out.println("余额不足");
            return;
        }

        // 还有钱扣
        super.withdraw(amount);
        super.withdraw(getCommission());
    }
}
