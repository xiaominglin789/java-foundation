package com.xiaominglin789.extend.exercise;

public class Exercise02 {
    public static void main(String[] args) {
        /**
         * 题目:
         * 编写: Computer类, 包含 CPU、内存、硬盘等属性,getDetails方法应用于返回Compter的详细信息
         * 编写 PC子类,继承Computer类,添加特定属性:品牌-brand
         * 编写 NotePad子类,继承Computer类,添加特有属性: color
         * main中创建 PC 和 NotePad对象,打印它们的信息
         */
        PC hw = new PC("麒麟999", 16, 512, "华为");
        hw.getPcInfo();

        NotePad pad = new NotePad("苹果M1", 16, 512, "银灰色");
        pad.getNoteInfo();
    }
}

class Computer {
    private String CUP;
    private int memory;
    private int disk;

    public String getCUP() {
        return CUP;
    }

    public void setCUP(String CUP) {
        this.CUP = CUP;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public Computer(String CUP, int memory, int disk) {
        this.CUP = CUP;
        this.memory = memory;
        this.disk = disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String getDetails() {
        return "CUP = " + CUP + "，内存 = " + memory + ",硬盘 = " + disk;
    }
}

class PC extends Computer {
    private String brand;

    public PC(String CUP, int memory, int disk) {
        this(CUP, memory, disk, null);
    }

    public PC(String CUP, int memory, int disk, String brand) {
        super(CUP, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void getPcInfo() {
        String info = getDetails()  + ",品牌=" + brand;
        System.out.println(info);
    }
}

class NotePad extends Computer {
    private String color;

    public NotePad(String CUP, int memory, int disk) {
        this(CUP, memory, disk, null);
    }

    public NotePad(String CUP, int memory, int disk, String color) {
        super(CUP, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getNoteInfo() {
        System.out.println(getDetails() + ",颜色=" + color);
    }
}
