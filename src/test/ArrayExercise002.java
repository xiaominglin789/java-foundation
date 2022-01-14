import java.util.Scanner;

public class ArrayExercise002 {
    public static void main(String[] args) {
        // test01();
        // test02();
        // test03();
        test04();
    }

    static void test01() {
        /*
        请求出一个数组 int[] 中的最大值：{4, -1, 9, 10, 23},并且得到对应的下标
        思路:
            1.假定 max = nums[0], maxIndex = 0
            2.遍历比较, 如果 max < nums[x], 那么 max不是最大值, 把 nums[x] 设置成最大值
            3.数组遍历完成后就可以得到最大值及其下标
         */
        int[] nums = {4, -1, 9, 10, 23};
        int index = 0;
        int max = nums[index];
        for (int i=1; i < nums.length; i++) {
            if (max < nums[i]) {
                index = i;
                max = nums[i];
            }
        }
        System.out.println("最大值: " + max);
        System.out.println("下标是: " + index);
    }

    static void test02() {
        /*
        1-100以内的数求和，求出 当 和 第一次大于20的当前数。
         */
        int start = 1;
        int end = 100;
        int limit = 20;
        int result = 0;
        for (int i=0; i < end; i++) {
            result += i;
            if (result > 20) {
                System.out.println("当前数是:" + i);
                System.out.println("------------end----------");
                break;
            }
        }
    }

    static void test03() {
        /*
        实现银行取钱的登录认证, 3次机会。假设账号: admin，密码: 123. 输入成功则提示登录成功,
        否则提示还剩几次机会,3次输入错误则暂时冻结。
        字符串的比较使用: string.equals(比对的内容)
         */
        String realUsername = "admin";
        String realPassword = "123";
        int inputCount = 3;

        Scanner sc = new Scanner(System.in);
        String inputUsername = "";
        String inputPassword = "";
        for (int i=0; i < 3; i++) {
            System.out.println("请输入账号:");
            inputUsername = sc.next();
            System.out.println("请输入密码:");
            inputPassword = sc.next();
            // 比对账号和密码
            if (realUsername.equals(inputUsername) &&
                    realPassword.equals((inputPassword))) {
                System.out.println("登录成功.");
                break;
            } else {
                inputCount--;
                if (inputCount > 0) {
                    System.out.println("账号或密码错误, 还剩 " + inputCount + " 次输入机会");
                    System.out.println("-------------------------");
                }
            }
        }
        if (inputCount <= 0) {
            System.out.println("3次输入错误,账号暂时冻结，请联系银行0000-0000协助帮助");
        }
    }

    static void test04() {
        /*
        实现银行取钱的登录认证, 3次机会。假设账号: admin，密码: 123. 输入成功则提示登录成功,
        否则提示还剩几次机会,3次输入错误则暂时冻结。
        字符串的比较使用: string.equals(比对的内容)
         */
        int MIN = 1;
        int MAX = 3;
        int count = 3;
        Scanner sc = new Scanner(System.in);
        String realUsr = "root";
        String realPwd = "123";
        String inputUsr = "";
        String inputPwd = "";
        for(int i=MIN; i <= MAX; i++) {
            System.out.println("请输入账号");
            inputUsr = sc.next();
            System.out.println("请输入密码");
            inputPwd = sc.next();

            count--;
            if (!realUsr.equals(inputUsr) || !realPwd.equals(inputPwd)) {
                System.out.println("账号或密码不对");
                if (count > 0) {
                    System.out.println("剩下 " + count + " 次输入机会.");
                    System.out.println("----------------");
                    continue;
                } else {
                    System.out.println("三次输入错误，账号暂时被冻结");
                    break;
                }
            }
            if (realUsr.equals(inputUsr) && realPwd.equals(inputPwd)) {
                // 同时正确
                System.out.println("恭喜,登录成功.");
                break;
            }
        }
    }
}
