package com.xiaominglin789.project02.view;

import com.xiaominglin789.project02.lib.Utility;
import com.xiaominglin789.project02.model.HouseModel;
import com.xiaominglin789.project02.service.HouseService;

public class HouseSystemView {
    private String title = "-------------房屋出租系统-------------";
    private boolean loop = true;
    private char key = ' '; // 接收用户输入
    private HouseService houseService = new HouseService(10);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 菜单界面
     */
    public void showMenu() {
        do {
            System.out.println(title);
            System.out.println("            1 新增房源");
            System.out.println("            2 查找房屋");
            System.out.println("            3 删除房屋信息");
            System.out.println("            4 修改房屋信息");
            System.out.println("            5 房屋列表");
            System.out.println("            6 退   出");
            System.out.print("请输入选项: ");
            key = Utility.readMenuSelection();

            switch (key) {
                case '1':
                    // 新增房源
                    addHouse();
                    break;
                case '2':
                    // 查找房屋
                    selectHouse();
                    break;
                case '3':
                    // 删除房屋信息
                    deleteHouse();
                    break;
                case '4':
                    // 修改房屋信息
                    updateHouse();
                    break;
                case '5':
                    // 房屋列表
                    listHouse();
                    break;
                case '6':
                    // 退出
                    exit();
                    break;
            }
        } while(loop);
    }

    /**
     * 新增房源
     */
    private void addHouse() {
        System.out.println("\n-------------新增房源-------------");
        System.out.print("姓名: ");
        String name = Utility.readString(6);
        System.out.print("手机: ");
        String tel = Utility.readString(6);
        System.out.print("房屋地址: ");
        String address = Utility.readString(6);
        System.out.print("租金: ");
        double rent = Utility.readDouble( 0);

        HouseModel houseModel = new HouseModel(0, name, tel, address, rent, "未出租");
        houseService.addHouse(houseModel);
    }

    /**
     * 查找房屋
     */
    private void selectHouse() {
        System.out.println("\n-------------查找房屋-------------");
        System.out.print("输入要查找的房屋编号: ");

        int id = Utility.readInt();
        HouseModel current = houseService.getHouseById(id);

        if (current==null) {
            System.out.println("没有该编号的房屋信息");
        } else {
            System.out.println(current);
        }
    }

    /**
     * 删除房屋信息
     */
    private void deleteHouse() {
        System.out.println("\n-------------删除房屋信息-------------");
        System.out.print("输入要删除的房屋编号: ");

        int id = Utility.readInt();
        boolean deleted = houseService.deleteHouseById(id);

        if (!deleted) {
            System.out.println("没有该编号的房屋信息");
        } else {
            System.out.println("已成功删除 编号为: " + id + "的房屋信息");
        }
    }

    /**
     * 修改房屋信息
     */
    private void updateHouse() {
        System.out.println("\n-------------修改房屋信息-------------");
        System.out.print("输入要修改的房屋编号: ");
        int id = Utility.readInt();
        if (!houseService.findHouseExistsById(id)) {
            System.out.println("没有该编号的房屋信息");
            return;
        }

        char sureChar = Utility.readConfirmSelection("真的要修改吗？");
        if (sureChar == 'N') {
            return;
        }
        System.out.print("姓名: ");
        String name = Utility.readString(6, "");
        System.out.print("手机: ");
        String tel = Utility.readString(6, "");
        System.out.print("房屋地址: ");
        String address = Utility.readString(6, "");
        System.out.print("租金: ");
        double rent = Utility.readDouble(0);
        System.out.print("房屋状态: ");
        String status = Utility.readString(6);

        boolean updated = houseService.updateHouse(id, name, tel, address, rent, status);
        if (!updated) {
            System.out.println("更新失败");
        } else {
            System.out.println("更新成功");
        }
    }

    /**
     * 房屋列表
     */
    private void listHouse() {
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        HouseModel[] list = houseService.getHouseList();
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                System.out.println(list[i]);
            }
        }
    }

    private void exit() {
        char c = Utility.readConfirmSelection("真的要退出吗?");

        if (c == 'Y') {
            loop = false;
        }
    }

    /** 系统运行入口 */
    public void run(){
        showMenu();
    }
}
