/*
# bit是计算机中最小的存储单位
# byte是计算机中基本存储单元
# 1byte = 8bit
基本数据类型   所占字节    范围(有符号,符号占一位: 2^n-1)
整数:
byte           1个字节   -128 ~ 127
short		   2个字节   -(2^15) ~ (2^15 -1)
int 		   4个字节   -(2^31) ~ (2^31 -1)
long 		   8个字节   -(2^63) ~ (2^63 -1)

小数:
float 		   4个字节   -(2^31) ~ (2^31 -1)
double 		   8个字节   -(2^31) ~ (2^31 -1)

字符型:
char           2个字节   (2^31) ~ (2^31 -1)
boolean        1位
*/
public class Number {
    public static void main(String[] args) {
        byte n1 = 10; // 内存空间为: 1
        short n2 = 10; // 内存空间为: 2
        int n3 = 10; // 内存空间为: 4
        long n4 = 10L; // 内存空间为: 8

        // int x = 10L; // 错误: 不兼容的类型: 从long转换到int可能会有损失
        // System.out.println(x);
    }
}