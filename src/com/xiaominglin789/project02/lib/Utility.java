package com.xiaominglin789.project02.lib;

import java.util.Scanner;

/**
 * Scanner输入辅助工具
 */
public class Utility {
    private static Scanner scanner = new Scanner(System.in);

    /*用于界面的选择。
    该方法读取键盘，如果用户输入1到4的任意字符，方法返回值为输入的任意字符
    */
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6') {
                System.out.print("选择错误，请重新输入: ");
            } else break;
        }
        return c;
    }

    public static char readChar() {
        String str = readKeyBoard(1);
        return str.charAt(0);
    }

    public static char readChar(char defaultValue) {
        String str = readKeyBoard(1, true);
        return (str.length() == 0) ? defaultValue : str.charAt(0);
    }

    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(4);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入有误，请重新输入：");
            }
        }
        return n;
    }

    /**
     * 用于支出和收入金额的输入，读取一个不超过4位数长度的整数，并将其作为方法的返回值
     * @return
     */
    public static int readInt(int defaultValue) {
        int n;
        for (; ; ) {
            String str = readKeyBoard(4, true);
            if (str.equals("")) {
                return defaultValue;
            }

            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入有误，请重新输入：");
            }
        }
        return n;
    }

    public static double readDouble(double defaultValue) {
        double n;
        for(; ; ) {
            String str = readKeyBoard(4, true);
            if (str.equals("")) {
                return defaultValue;
            }

            try {
                n = Double.parseDouble(str);
                break;
            } catch (Exception e) {
                System.out.print("数字输入有误，请重新输入：");
            }
        }
        return n;
    }

    /**
     * 用于支出和收入说明的输入。用于读取从键盘输入的不超过8为字符串长度的输入值，并将其作为方法的返回值
     * @return
     */
    public static String readString() {
        return readString(1);
    }

    public static String readString(int limit) {
        return readKeyBoard(limit);
    }

    public static String readString(int limit, String defaultValue) {
        String str = readKeyBoard(limit, true);
        return str.equals("") ? defaultValue : str;
    }

    /**
     * 用于确认选择的输入，从键盘读取'y'或者'n',并将其作为返回值
     * @return
     */
    public static char readConfirmSelection(String tip) {
        System.out.print(tip + " 输入你的选择?(y / n) ");
        char c;
        for (; ; ) {
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("选择错误，请重新输入： ");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit) {
        return readKeyBoard(limit, false);
    }

    /**
     * 读取一个字符串输入
     * @param limit 读取的长度
     * @param blankReturn true:读取空字符串, false:不读空字符串
     * @return
     */
    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }
            if (line.length() < 1 || line.length() > limit) {
                System.out.println("限定了输入长度范围: [1," + limit + "]");
                continue;
            }
            break;
        }
        return line;
    }
}