package com.example.indydesk;

public class Rowitem {
    private int pict;
    private String fooditem;
    private String price;

    public Rowitem(int pict, String fooditem, String price) {
        this.pict = pict;
        this.fooditem = fooditem;
        this.price = price;
    }

    public int getPict() {
        return pict;
    }

    public void setPict(int pict) {
        this.pict = pict;
    }

    public String getFooditem() {
        return fooditem;
    }

    public void setFooditem(String fooditem) {
        this.fooditem = fooditem;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
