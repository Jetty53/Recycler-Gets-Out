package com.wheic.recyclergetsout.RV1;

public class RVOneModel {
    private String name; //this variable will store main-list item title
    private int num; //this will help differentiate between the main-list items

    //parameterized constructor
    public RVOneModel(String name, int num) {
        this.name = name;
        this.num = num;
    }

    //getter functions for these two variables
    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }


}
