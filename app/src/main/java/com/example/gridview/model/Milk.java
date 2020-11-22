package com.example.gridview.model;

public class Milk {
    private int mAnh;
    private int mcheck;
    private String mtenquan;
    private String mdiachi;
    private String mdanhgia;
    private String mtgian;
    private String mkhac;

    public Milk(int mAnh, int mcheck, String mtenquan, String mdiachi, String mdanhgia, String mtgian, String mkhac) {
        this.mAnh = mAnh;
        this.mcheck = mcheck;
        this.mtenquan = mtenquan;
        this.mdiachi = mdiachi;
        this.mdanhgia = mdanhgia;
        this.mtgian = mtgian;
        this.mkhac = mkhac;
    }

    public int getmAnh() {
        return mAnh;
    }

    public void setmAnh(int mAnh) {
        this.mAnh = mAnh;
    }

    public int getMcheck() {
        return mcheck;
    }

    public void setMcheck(int mcheck) {
        this.mcheck = mcheck;
    }

    public String getMtenquan() {
        return mtenquan;
    }

    public void setMtenquan(String mtenquan) {
        this.mtenquan = mtenquan;
    }

    public String getMdiachi() {
        return mdiachi;
    }

    public void setMdiachi(String mdiachi) {
        this.mdiachi = mdiachi;
    }

    public String getMdanhgia() {
        return mdanhgia;
    }

    public void setMdanhgia(String mdanhgia) {
        this.mdanhgia = mdanhgia;
    }

    public String getMtgian() {
        return mtgian;
    }

    public void setMtgian(String mtgian) {
        this.mtgian = mtgian;
    }

    public String getMkhac() {
        return mkhac;
    }

    public void setMkhac(String mkhac) {
        this.mkhac = mkhac;
    }
}
