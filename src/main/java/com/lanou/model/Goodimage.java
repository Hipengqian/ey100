package com.lanou.model;

public class Goodimage {
    private Integer iid;

    private String imagelist;

    private String bigimage;

    private String smallimage1;

    private String smallimage2;

    private String smallimage3;

    private String smallimage4;

    private String smallimage5;

    private String imageGproductid;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getImagelist() {
        return imagelist;
    }

    public void setImagelist(String imagelist) {
        this.imagelist = imagelist == null ? null : imagelist.trim();
    }

    public String getBigimage() {
        return bigimage;
    }

    public void setBigimage(String bigimage) {
        this.bigimage = bigimage == null ? null : bigimage.trim();
    }

    public String getSmallimage1() {
        return smallimage1;
    }

    public void setSmallimage1(String smallimage1) {
        this.smallimage1 = smallimage1 == null ? null : smallimage1.trim();
    }

    public String getSmallimage2() {
        return smallimage2;
    }

    public void setSmallimage2(String smallimage2) {
        this.smallimage2 = smallimage2 == null ? null : smallimage2.trim();
    }

    public String getSmallimage3() {
        return smallimage3;
    }

    public void setSmallimage3(String smallimage3) {
        this.smallimage3 = smallimage3 == null ? null : smallimage3.trim();
    }

    public String getSmallimage4() {
        return smallimage4;
    }

    public void setSmallimage4(String smallimage4) {
        this.smallimage4 = smallimage4 == null ? null : smallimage4.trim();
    }

    public String getSmallimage5() {
        return smallimage5;
    }

    public void setSmallimage5(String smallimage5) {
        this.smallimage5 = smallimage5 == null ? null : smallimage5.trim();
    }

    public String getImageGproductid() {
        return imageGproductid;
    }

    public void setImageGproductid(String imageGproductid) {
        this.imageGproductid = imageGproductid == null ? null : imageGproductid.trim();
    }
}