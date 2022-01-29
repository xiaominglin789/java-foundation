package com.xiaominglin789.project01.homework5;

public class Exercise {
    public static void main(String[] args) {
        /**
         * 打印效果如下:
         * 老师
         * 姓名: 张飞
         * 性别: 男
         * 年龄: 30
         * 工龄: 5
         * 我承诺,我会认真教课
         * 张飞的爱好: 象棋
         * ---------------------
         * 学生
         * 姓名: 小明
         * 性别: 男
         * 年龄: 13
         * 学号: 00023102
         * 我承诺,我会好好学习
         * 张飞的爱好: 踢足球
         */
        /**
         * 题目描述:
         * 1.看打印结果: 编写一个Person类
         * 2.子类: Student类、Teacher类
         * 3.Student类有 study方法 -> 我承诺,我会好好学习。
         * 4.Teacher类有 trach方法 -> 我承诺,我会认证教课。
         * 5.都有 play方法
         * 6.定义多态数组，保存2个学生和2个老师的信息，要求按照年龄从高到低排序
         * 7.定义方法, 完成需求: 调用学生study方法或老师的teach方法
         */
        Teacher person = new Teacher("张飞", "教师", '男', 30, "象棋", 5);
        Student person1 = new Student("小明", "学生", '男', 13, "踢足球", "00023102");

        person.print();
        System.out.println("--------------------------");
        person1.print();

        Person[] personArr = new Person[4];
        personArr[0] = new Teacher("张飞", "教师", '男', 30, "象棋", 5);
        personArr[1] = new Teacher("关羽", "教师", '男', 37, "骑马", 10);
        personArr[2] = new Student("小蓝", "学生", '男', 10, "打篮球", "00023101");
        personArr[3] = new Student("小明", "学生", '男', 13, "踢足球", "00023102");

        System.out.println("排序前:");
        printArr(personArr);
        System.out.println("--------------------");
        sort(personArr);
        System.out.println("排序后:");
        printArr(personArr);

        for (int i = 0; i < personArr.length; i++) {
            if (personArr[i] instanceof Teacher) {
                ((Teacher) personArr[i]).teach();
            } else if (personArr[i] instanceof Student) {
                ((Student) personArr[i]).study();
            }
        }
    }
    
    public static void printArr(Person[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public static void sort(Person[] arr) {
        for (int i=0; i < arr.length-1; i++) {
            boolean change = false;
            for (int j = 0; j < arr.length-1 - i; j++) {
                // 年龄从高到低
                if (arr[j].getAge() < arr[j+1].getAge()) {
                    Person temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    change = true;
                }
            }
            if (!change) {
                break;
            }
        }
    }
}
