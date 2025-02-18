package com.hspeds.HousRent.HouseService;

import com.hspeds.HousRent.Domain.House;

public class HouseService {
    private House[] houses;
    private int HouseNum = 1;
    private int idCounter = 1;

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "史密斯", "13858654945", "街道6号", 1500, "未出租");
    }

    public boolean add(House newhouse) {
        if (HouseNum == houses.length) {
            System.out.println("数组已满，不能再添加了");
            return false;
        }
        houses[HouseNum++] = newhouse;
        newhouse.setId(++idCounter);
        return true;
    }

    public House[] list() {
        return houses;
    }


}
