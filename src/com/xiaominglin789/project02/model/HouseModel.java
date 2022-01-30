package com.xiaominglin789.project02.model;

public class HouseModel {
    private int id;       // id
    private String name;  // 房主名
    private String telphone; // 手机号
    private String address; // 房源地址
    private double rent; // 租金
    private String status; // 房屋状态

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HouseModel(int id, String name, String telphone, String address, double rent, String status) {
        this.id = id;
        this.name = name;
        this.telphone = telphone;
        this.address = address;
        this.rent = rent;
        this.status = status;
    }

    @Override
    public String toString() {
        return id +
                "\t\t" + name +
                "\t\t" + telphone +
                "\t\t" + address +
                "\t" + rent +
                "\t" + status;
    }
}
