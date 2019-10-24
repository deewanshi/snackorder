package com.example.indydesk;

import android.os.Parcel;
import android.os.Parcelable;

public class Album implements Parcelable {

    private String name;
    private int discount;
    private int thumbnail;



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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.discount);
        dest.writeInt(this.thumbnail);

    }

    protected Album(Parcel in){
        this.name=in.readString();
        this.discount=in.readInt();
        this.thumbnail=in.readInt();
    }

    public static final Creator<Album> CREATOR = new Creator<Album>() {
        @Override
        public Album createFromParcel(Parcel source) {
            return new Album(source);
        }

        @Override
        public Album[] newArray(int size) {
            return new Album[size];
        }
    };

}
