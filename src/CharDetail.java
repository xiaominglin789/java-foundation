/*
字符的本质: 还是数字
编码: Unicode表: (a = 97, 65 = A) 2个字节, 取值范围: 0~2^16, 字符范围: U0000-UFFFF
*/
public class CharDetail {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1); // a
        System.out.println((int)c1); // 97
        System.out.println(c2); // 中
        System.out.println((int)c2); // 20013
        char c3 = '\u0061';
        System.out.println(c3); // 'a'

        // 转义字符:
        // \t:  制表符(tab)
        // \n:  换行(回车)
        System.out.println("Hello\tworld"); // Hello    world
        System.out.println("Hello\nworld"); // Hello 换行 world

        // String
        // new的实例对象 内存地址不同
        String s1 = new String("我是字符串");
        String s2 = new String("我是字符串");
        String s3 = "我是字符串";
        String s4 = "我是字符串";
        System.out.println(s1 == s2); // false
        System.out.println(s3 == s4); // true
    }
}