import java.util.Scanner;

public class Array001 {
    static int[] emptyNums;

    public static void main(String[] args) {
        /*
        数组：一组 同一类型 的数据
        数组可以通过for循环遍历
         */
        double[] weights = {3, 5, 1, 3.4, 2, 50};
        double total = 0D;

        for(int i=0; i < weights.length; i++) {
            System.out.println("第 " + (i+1) + " 个元素的值: " + weights[i]);
            total += weights[i];
        }
        System.out.println("总数：" + total);

        double ave = (double) (total / weights.length);
        System.out.println("平均数：" + ave);

        /*
        数组的两种初始化：
            动态初始化: [[0][0][0][0][0]]
            和静态初始化: [[1][2][3][4][5]]
         */
        int[] nums = new int[5]; // 动态定义一个长度为5的int数组,元素的默认值:int 0
        int[] sizes = {1, 2, 3, 4, 5}; // 静态初始化并赋值

        System.out.println(emptyNums);
        emptyNums = new int[5];
        emptyNums[0] = 11;
        emptyNums[1] = 22;
        emptyNums[2] = 33;
        emptyNums[3] = 44;
        System.out.println(emptyNums);
        System.out.println(emptyNums[2]);
        System.out.println(emptyNums[4]);

        /*
        使用数组的步骤:
            - 1.声明数组并开辟内存空间
            - 2.给数组各个元素赋值
            - 3.使用数组
         */
        // 声明数组
        int[] moneys;
        // 开辟内存空间
        moneys = new int[4];
        // 元素赋值
        moneys[0] = 100;
        moneys[1] = 50;
        moneys[2] = 10;
        moneys[3] = 1;
        // 数组的使用
        System.out.println("数组的长度:" + moneys.length);
    }
}
