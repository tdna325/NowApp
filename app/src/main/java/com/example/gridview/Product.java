package com.example.gridview;

public class Product {
    private int mImage ;
    private String mName;
    private String mAdd;
    private String mSao;

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAdd() {
        return mAdd;
    }

    public void setmAdd(String mAdd) {
        this.mAdd = mAdd;
    }

    public String getmSao() {
        return mSao;
    }

    public void setmSao(String mSao) {
        this.mSao = mSao;
    }

    public Product(int mImage, String mName, String mAdd, String mSao) {
        this.mImage = mImage;
        this.mName = mName;
        this.mAdd = mAdd;
        this.mSao = mSao;
    }
}
