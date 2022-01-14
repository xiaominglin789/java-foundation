/*
静态修饰符: final
初始化后不能再改变值，不会变的值
静态常量命名：大写
 */
public class Static001 {
    public static void main(String[] args) {
        final int NUM_COUNT = 19;
        final char CHAR_NAME = 'C';
        System.out.println((char) (CHAR_NAME+NUM_COUNT)); // 'V'
    }
}