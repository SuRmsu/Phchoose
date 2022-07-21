package com.surm.phchoose.entity;

public class Phone {
    private String Id;
    private String Brand;
    private String Cpu;
    private int Battery;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getCpu() {
        return Cpu;
    }

    public void setCpu(String Cpu) {
        this.Cpu = Cpu;
    }

    public int getBattery() {
        return Battery;
    }

    public void setBattery(int Battery) {
        this.Battery = Battery;
    }
}