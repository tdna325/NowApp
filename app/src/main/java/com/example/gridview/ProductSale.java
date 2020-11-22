package com.example.gridview;

public class ProductSale {
    private int mImage ;
    private String mName;
    private String mStore;
    private String mGiaMoi;
    private String mGiaCu;

    public ProductSale(int mImage, String mName, String mStore, String mGiaMoi, String mGiaCu) {
        this.mImage = mImage;
        this.mName = mName;
        this.mStore = mStore;
        this.mGiaMoi = mGiaMoi;
        this.mGiaCu = mGiaCu;
    }

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

    public String getmStore() {
        return mStore;
    }

    public void setmStore(String mStore) {
        this.mStore = mStore;
    }

    public String getmGiaMoi() {
        return mGiaMoi;
    }

    public void setmGiaMoi(String mGiaMoi) {
        this.mGiaMoi = mGiaMoi;
    }

    public String getmGiaCu() {
        return mGiaCu;
    }

    public void setmGiaCu(String mGiaCu) {
        this.mGiaCu = mGiaCu;
    }
}
