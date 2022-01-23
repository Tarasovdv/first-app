package ru.itsjava.oop.oopHW;

public class Iron {

    private String model;
    private int price;
    private String color;

    public Iron(String model, int price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public Iron(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public Iron(int price) {
        this.price = price;
    }

    public Iron() {

    }


    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
