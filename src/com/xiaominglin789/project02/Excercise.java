package com.xiaominglin789.project02;

import com.xiaominglin789.project02.lib.Utility;
import com.xiaominglin789.project02.view.HouseSystemView;

public class Excercise {
    public static void main(String[] args) {
        /**
         * 实现基于文字解密的房屋出租系统
         * 能够实现对房屋信息的添加、修改、删除，查看
         *  界面:
         *  -------------房屋出租系统-------------
         *              1 新增房源
         *              2 查找房屋
         *              3 删除房屋信息
         *              4 修改房屋信息
         *              5 房屋列表
         *              6 退   出
         *
         *  房屋列表:
         *  编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)
         */
        HouseSystemView houseSystemView = new HouseSystemView();
        houseSystemView.run();
    }
}
