package com.xiaominglin789.project02.service;

import com.xiaominglin789.project02.model.HouseModel;

import java.lang.reflect.Array;

public class HouseService {
    private HouseModel[] houses;
    private int realLength = 0;

    public HouseService(int size) {
        init(size);
    }

    private void init(int size) {
        this.houses = new HouseModel[size];
        houses[0] = new HouseModel(1, "八戒", "135", "高老庄", 6666.00, "未出租");
        houses[1] = new HouseModel(2, "八戒", "135", "高老庄", 6666.00, "未出租");
        setRealLength(2);
    }

    /**
     * 更新数组真实使用长度
     * @param realLength
     */
    public void setRealLength(int realLength) {
        this.realLength = realLength;
    }

    /**
     * 数组真实使用长度
     * @return
     */
    public int getRealLength() {
        return realLength;
    }

    /**
     * 获取数组长度
     * @return
     */
    private int getHousesMaxSize() {
        return houses.length;
    }

    /**
     * 通过id查找房屋信息
     * @param id
     * @return
     */
    public HouseModel getHouseById(int id) {
        HouseModel result = findHouseById(id);
        return result;
    }

    /**
     * 获取房屋列表
     * @return
     */
    public HouseModel[] getHouseList() {
        return houses;
    }

    /**
     * 真实房屋自增id
     * @return
     */
    public int autoRecumentHouseId() {
        return this.realLength + 1;
    }

    /**
     * 检测数组是否已满
     * @return
     */
    private boolean checkArrayIsFull() {
        if (getRealLength() >= getHousesMaxSize()) {
            return true;
        }
        return false;
    }

    /**
     * 查找
     * @param id
     * @return
     */
    public boolean findHouseExistsById(int id) {
        if (getRealLength() == 0) {
            return false;
        }

        for (int i = 0; i < getRealLength(); i++) {
            if (houses[i] != null && houses[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    /**
     * 查找
     * @param id
     * @return
     */
    private HouseModel findHouseById(int id) {
        for (int i = 0; i < getRealLength(); i++) {
            if (houses[i] != null && houses[i].getId() == id) {
                return houses[i];
            }
        }
        return null;
    }

    /**
     * 添加新房屋信息
     *
     * @param houseModel
     * @return
     */
    public boolean addHouse(HouseModel houseModel) {
        if (checkArrayIsFull()) {
            System.out.println("数组已满,不能再添加了");
            return false;
        }

        houseModel.setId(autoRecumentHouseId());
        houses[getRealLength()] = houseModel;
        this.realLength++;
        return true;
    }

    private void printReal() {
        for (int i = 0; i < getRealLength(); i++) {
            System.out.println(houses[i]);
        }
    }

    private void print() {
        for (int i = 0; i < houses.length; i++) {
            System.out.println(houses[i]);
        }
    }

    /**
     * 删除id号房屋
     * @param id
     * @return
     */
    public boolean deleteHouseById(int id) {
        HouseModel current = findHouseById(id);
        System.out.println(current);

        if (current == null) {
            return false;
        }
        System.out.println("查找到的id: " + current.getId());
        // 删除某id的房屋信息,id = 对应下标位置+1
        if (current.getId() == getRealLength()) {
            houses[current.getId() - 1] = null;
            return true;
        }

        for (int i = current.getId() - 1; i < getRealLength() - 1; i++) {
            // 将当前项移动到有效数组末尾
            HouseModel temp = houses[i];
            houses[i] = houses[i + 1];
            houses[i + 1] = temp;
        }
        // 将移动到有效数组末尾的当前项置空
        houses[getRealLength() - 1] = null;
        this.realLength--;
        return true;
    }

    /**
     * 更新某id的
     * @param id
     * @param name
     * @param tel
     * @param address
     * @param rent
     */
    public boolean updateHouse(int id, String name, String tel, String address, double rent, String status) {
        HouseModel current = getHouseById(id);
        if (current == null) {
            System.out.println("没有该编号的房屋信息");
            return false;
        }

        if (!"".equals(name)) {
            current.setName(name);
        }
        if (!"".equals(tel)) {
            current.setTelphone(tel);
        }
        if (!"".equals(address)) {
            current.setAddress(address);
        }
        if (rent > 0) {
            current.setRent(rent);
        }
        if (!"".equals(status)) {
            current.setStatus(status);
        }
        return true;
    }
}
