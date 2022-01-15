public class Ch_9_Practice {
  public static void main(String[] args) {
    /**
    练习:
      1.保存两本书的名字,用 `+` 拼接。
      2.保存两个性别,用 `+` 拼接。
      3.保存两个本书的价格,用 `+` 拼接。
     */
    String bookName1 = "哈利波特";
    String bookName2 = "魔戒";
    System.out.println(bookName1 + bookName2); // "哈利波特魔戒"

    char man = '男';
    char woman = '女';
    System.out.println(man + woman); // 码值相加, 52906

    double bookPrice1 = 16.9f;
    double bookPrice2 = 9.99f;
    System.out.println(bookPrice1 + bookPrice2); // 26.89


    /**
    练习2: 如下格式输出
      姓名  年龄  成绩   性别   爱好
      xx   xx    xx    xx    xx
     */
    String name = "张三";
    short  age = 18;
    int score = 69;
    char sex = '男';
    String hobby = "犯罪";
    System.out.println("名字\t年龄\t成绩\t性别\t爱好\n" 
    + name + "\t" + age + "\t" + score + "\t"
    + sex + "\t" + hobby);
  }
}