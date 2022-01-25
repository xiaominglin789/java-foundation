package com.xiaominglin789.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("apem", 123, "123654");
        System.out.println("account = " + account);
    }
}

/**
 * Account类要求:
 * 属性:
 *  - 姓名: 长度: 2-4位
 *  - 余额: > 20
 *  - 密码: 长度6位
 * 如果不满足，则给出提示信息，并给默认值
 * 通过setXxx给Accout的属性赋值
 */
class Account {
    private String username;
    private double money;
    private String password;

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", money=" + money +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username.length() >= 2 && username.length() <= 4) {
            this.username = username;
        } else {
            this.username = "默认名字";
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money >= 20) {
            this.money = money;
        } else {
            throw new Error("余额必须大于等于20");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            throw new Error("密码长度必须是6位");
        }
    }

    public Account(String username, double money, String password) {
        this.setUsername(username);
        this.setPassword(password);
        this.setMoney(money);
    }
}

