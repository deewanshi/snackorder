package com.example.indydesk;

public class Album {

    private String name;
    private int discount;
    private int thumbnail;

    public Album() {
    }

    public Album(String name, int discount, int thumbnail) {
        this.name = name;
        this.discount = discount;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
