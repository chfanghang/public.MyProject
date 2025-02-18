package com.hspeds.HousRent.HouseView;

import com.hspeds.HousRent.Domain.House;
import com.hspeds.HousRent.HouseService.HouseService;
import com.hspeds.HousRent.Utils.utility;
import org.jcp.xml.dsig.internal.dom.Utils;

public class mainMenu {
    private HouseService houseService = new HouseService(10);
    private boolean loop = true;
    private char key = ' ';

    public void addHouse() {
        System.out.println("===========增 加 房 屋===========");
        System.out.println("姓名:");
        String name=utility.readSting();
        System.out.println("电话:");
        String phone=utility.readSting();
        System.out.println("地址:");
        String address=utility.readSting();
        System.out.println("月租:");
        int rent=utility.readInt();
        System.out.println("状态:");
        String state=utility.readSting();
        House newhouse=new House(0,name,phone,address,rent,state);
        if (houseService.add(newhouse)) {
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    public void listHouse() {
        System.out.println("===========房 屋 列 表===========");
        System.out.println("编号\t\t房主\t\t电话\t\t\t地址\t\t月租\t\t\t状态(未出租/已出租)");
        House[] house = houseService.list();
        for (int i = 0; i < house.length; i++) {
            if (house[i] == null) {
                break;
            }
            System.out.println(house[i].toString());
        }
        System.out.println("---房 屋 列 表 显 示 完 毕---");
    }


    public void mainMenu() {
        do {
            System.out.println("\n===================房屋出租系统=================");
            System.out.println("\t\t\t1 增 加 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 房 屋");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退 出 系 统");
            System.out.println("请输入（1-6）:");
            key = utility.readchar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    System.out.println("\t\t2 查 找");
                    break;
                case '3':
                    System.out.println("\t\t3 删 除");
                    break;
                case '4':
                    System.out.println("\t\t4 修 改");
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    System.out.println("退出房屋出租系统");
                    loop = false;
                    break;
            }
        } while (loop);
    }
}
