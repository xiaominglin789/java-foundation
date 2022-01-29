package com.xiaominglin789.project01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ApplicationOOP {
    public static void main(String[] args) {
        /**
         * 需求:
         *  开发零钱通: 完成收益入账、消费、查看明细、退出系统等功能
         *  界面
         *  -------------零钱通系统-------------
         * 	           1 零钱明细
         * 	           2 收益入账
         * 	           3 消费
         * 	           4 退出
         *  请选择(1-4):
         */
        BookkeepingSys bookkeepingSys = new BookkeepingSys();
        bookkeepingSys.run();
    }
}

class BookkeepingSys {
    String title = "-------------零钱通系统-------------";
    boolean exit = false; // 是否退出程序
    String details = ""; // 入账和消费的字符串
    double menoy = 0; // 接收scanner输入
    double balance = 0; // 余额
    Date date = null; // 日期变量
    Scanner scanner = new Scanner(System.in);

    public BookkeepingSys() {
    }

    public BookkeepingSys(String title) {
        this.title = title;
    }

    /**
     * 入账
     */
    public void income() {
        System.out.println("-------------收益入账-------------");
        System.out.print("收益入账金额: ");
        menoy = scanner.nextDouble();
        if (menoy <=0) {
            System.out.print("收益入账不能为 0 或 负数.");
            return;
        }
        // 合理的入账
        date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        balance += menoy;
        details += "\n收益入账: +" + menoy + " " + dateFormat.format(date) + " 余额: " + balance;
    }

    /**
     * 消费
     */
    public void spend() {
        System.out.println("-------------消    费-------------");
        System.out.print("消费金额: ");
        menoy = scanner.nextDouble();
        if (menoy <= 0) {
            System.out.println("消费金额不能为 0 或 负数.");
            return;
        }
        if (balance - menoy < 0) {
            System.out.println("余额不足,无法消费.");
            return;
        }
        // 合理的消费
        System.out.print("消费说明: ");
        String des = scanner.next();
        date = new Date();
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        // 减余额
        balance -= menoy;
        details += "\n消费金额: =" + menoy + " 消费说明: " + des + " " + dateFormat2.format(date) + " 余额:" + balance;
        return;
    }

    /**
     * 退出程序
     */
    public void close() {
        String choice = "";
        // 控制接收
        while(true) {
            System.out.print("是否退出程序(y / n): ");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            } else {
                System.out.println("输入有误, 重新输入.");
            }
        }
        // 控制是否退出
        if ("y".equals(choice)) {
            exit = true;
        }
    }

    /**
     * 程序执行入口
     */
    public void run() {
        while (!exit) {
            System.out.println(title);
            System.out.println("\t\t\t1 零钱明细\t\t\t");
            System.out.println("\t\t\t2 收益入账\t\t\t");
            System.out.println("\t\t\t3 消费\t\t\t");
            System.out.println("\t\t\t4 退出\t\t\t");
            System.out.print("请选择(1-4): ");
            int inputVale = scanner.nextInt();

            switch (inputVale) {
                case 1:
                    System.out.println("-------------零钱明细-------------");
                    System.out.println(details);
                    break;
                case 2:
                    income();
                    break;
                case 3:
                    spend();
                    break;
                case 4:
                    close();
                    break;
                default:
                    System.out.println("输入有误,请重新输入.");
                    break;
            }
            System.out.println();
        }
    }
}
