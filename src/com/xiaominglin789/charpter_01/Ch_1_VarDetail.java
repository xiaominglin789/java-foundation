public class Ch_1_VarDetail {
  public static void main(String[] args) {
    /** 
    变量: 表示内存中的一个存储区域[不同的变量,类型不同、占用空间的大小不同]
      - 1.先声明,后使用
      - 2.同一作用域下不能存在同名变量
      - 3.变量 = 变量名 + 值 + 数据类型
    */
    int a = 50;
    System.out.println(a); // 50

    a = 88;
    System.out.println(a); // 88


		/**
		常量:
			+ 使用 final 修饰符
			+ 初始化后 不能再改变值, 不会变的值。
			+ 常量名一般使用大写
		*/
		final double PI = 3.14;
    System.out.println(PI); // 3.14
    // PI = 6.666;             // 编译错误: 无法为最终变量PI分配值
    // System.out.println(PI);
  }
}