package com.hspeds.HousRent.Domain;

public class House {
    private int id;
    private String houseMaster;
    private String phone;
    private String address;
    private int rent;
    private String state;//状态

    public House(int id, String houseMaster, String phone, String address, int rent, String state) {
        this.id = id;
        this.houseMaster = houseMaster;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHouseMaster() {
        return houseMaster;
    }

    public void setHouseMaster(String houseMaster) {
        this.houseMaster = houseMaster;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return   id +
                "\t\t" + houseMaster  +
                "\t\t" + phone +
                "\t\t" + address  +
                "\t\t" + rent +
                "\t\t" + state ;
    }
}
