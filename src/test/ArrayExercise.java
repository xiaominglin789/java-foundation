public class ArrayExercise {
    public static void main(String[] args) {
        /*
        创建一个 char类型的26个元素的数组,分别存放 'A' - 'Z'
        使用for循环访问所有元素并打印出来
        提示: char类型数据运算 'A'+1 -> 'B'
         */
        char[] chars = new char[26];
        char startChar = 'A';
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (startChar + i);
        }

        System.out.println("chars数组:");
        for (char child:chars) {
            System.out.print(child+" ");
        }
        System.out.println();
    }
}
