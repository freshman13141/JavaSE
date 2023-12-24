package com.tingshuo.list;

public class Card{
    private String color;// 花色
    private String num;// 点数
    private int value;// 点数对应的值

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Card() {
    }

    public Card(String num, String color) {
        this.color = color;
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public String getNum() {
        return num;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Card(String color, String num, int value) {
        this.color = color;
        this.num = num;
        this.value = value;
    }

    @Override
    public String toString() {
        return num + color;
    }


}
