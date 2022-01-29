package com.xiaominglin789.project01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /**
         * 需求:
         *  开发记账系统: 完成收益入账、消费、查看明细、退出系统等功能
         *  面向过程实现:
         *   - 1.接收输入界面
         *          -------------记账系统-------------
         * 			            1 零钱明细
         * 			            2 收益入账
         * 			            3 消费
         * 			            4 退出
         *          请选择(1-4):
         *   - 2.入账
         *      - 接收入账金额、时间、账户余额
         *   - 3.消费
         */
        boolean exit = false;
        String details = ""; // 入账和消费的字符串
        double menoy = 0; // 接收scanner输入
        double balance = 0; // 余额
        Date date = null; // 日期变量

        Scanner scanner = new Scanner(System.in);
        while (!exit) {
            System.out.println("-------------记账系统-------------");
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
                    System.out.println("-------------收益入账-------------");
                    System.out.print("收益入账金额: ");
                    menoy = scanner.nextDouble();
                    if (menoy <=0) {
                        System.out.print("收益入账不能为 0 或 负数.");
                        break;
                    }
                    // 合理的入账
                    date = new Date();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    balance += menoy;
                    details += "\n收益入账: +" + menoy + " " + dateFormat.format(date) + " 余额: " + balance;
                    break;
                case 3:
                    System.out.println("-------------消    费-------------");
                    System.out.print("消费金额: ");
                    menoy = scanner.nextDouble();
                    if (menoy <= 0) {
                        System.out.println("消费金额不能为 0 或 负数.");
                        break;
                    }
                    if (balance - menoy < 0) {
                        System.out.println("余额不足,无法消费.");
                        break;
                    }
                    // 合理的消费
                    System.out.print("消费说明: ");
                    String des = scanner.next();
                    date = new Date();
                    SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
                    // 减余额
                    balance -= menoy;
                    details += "\n消费金额: =" + menoy + " 消费说明: " + des + " " + dateFormat2.format(date) + " 余额:" + balance;
                    break;
                case 4:
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
                    break;
                default:
                    System.out.println("输入有误,请重新输入.");
                    break;
            }
            System.out.println();
        }
    }
}
