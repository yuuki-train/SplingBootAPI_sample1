package com.example.sample1.app.resource;

import java.io.Serializable;

public class BirthStone implements Serializable {
    private static final long serialVersionUID = 1L;

    // 月
    private String month;
    // 名前
    private String name;
    // 色
    private String color;

    public BirthStone(String month, String name, String color) {
        this.month = month;
        this.name = name;
        this.color = color;
    }

    public String getMonth() {
        return this.month;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }


}
