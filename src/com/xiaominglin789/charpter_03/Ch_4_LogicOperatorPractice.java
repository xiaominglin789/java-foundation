public class Ch_4_LogicOperatorPractice {
  public static void main(String[] args) {
    int x = 5;
    int y = 5;
    // x=5 == 6 ? false x=x+1=6
    // false & ++y=6 == 6 = true
    // false & true => false
    if (x++==6 & ++y==6) {
      x = 11;
    }
    System.out.println("x=" + x + " y=" + y); // x=6, y=6

    int x1 = 5;
    int y1 = 5;
    // x1=5 == 6 false, x1=x1+5=6. 后面不再执行
    if (x1++==6 && ++y1==6) {
      x1 = 11;
    }
    System.out.println("x1=" + x1 + " y1=" + y1); // x1=6, y1=5

    int x2 = 5;
    int y2 = 5;
    // x2=5 == 5 true, x2=x2+1=6
    // ++y2 => y2=y2+1=6 == 5 false
    // true | false => true, x2=11
    if (x2++==5 | ++y2==5) {
      x2 = 11;
    }
    System.out.println("x2=" + x2 + " y2=" + y2); // x2=11, y2=6

    int x3 = 5;
    int y3 = 5;
    // x2=5 == 5 true, x2=x2+1=6, 后面条件不再执行
    // x3=11
    if (x3++==5 || ++y3==5) {
      x3 = 11;
    }
    System.out.println("x3=" + x3 + " y3=" + y3); // x3=11, y3=5

    boolean a = true;
    boolean b = false;
    short z = 46;
    // z=46 == 46 true, z++=47, 继续判断
    // b=true true。条件满足， z++ = 48
    if ((z++ == 46) && (b=true)) z++;
    // a=false false, 继续判断
    // ++z => z=49 == 49 true 满足条件 z++ => z=50
    if ((a=false) || (++z == 49) ) z++;
    System.out.println("z=" + z); // z=50
  }
}