package com.example.gridview;

public class Recyler  {
    private int pic;
    private String rc_name;

    public Recyler(int pic, String rc_name) {
        this.pic = pic;
        this.rc_name = rc_name;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getRc_name() {
        return rc_name;
    }

    public void setRc_name(String rc_name) {
        this.rc_name = rc_name;
    }
}
