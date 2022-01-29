package com.xiaominglin789.project01.homework3;

public class Exercise {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(0);
        bank.showBalance();
        bank.deposit(200);
        bank.showBalance();
        bank.withdraw(100);
        bank.showBalance();
        System.out.println("----------------------------");

        BankAccount bank2 = new CheckingAccount(0);
        bank2.showBalance();
        bank2.deposit(200);
        bank2.showBalance();
        System.out.println("----------------------------");

        SavingsAccount bank3 = new SavingsAccount(0);
        bank3.showBalance();
        bank3.deposit(100);
        bank3.deposit(100);
        bank3.deposit(100);
        bank3.deposit(100);
        bank3.deposit(7000);
        bank3.showBalance();

        // 计算上月利息
        bank3.earnMonthlyInterest();
        bank3.showBalance();
        bank3.withdraw(100);
        bank3.withdraw(100);
        bank3.withdraw(100);
        bank3.showBalance();
        bank3.withdraw(100);
        bank3.showBalance();
    }
}
