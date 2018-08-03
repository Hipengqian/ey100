package com.lanou.model;

import java.util.List;

public class Goods {
    private Integer gid;

    private String gname;

    private String gprice;

    private String gproductid;

    private String gbrand;

    private String gpack;

    private String gaddress;

    private String gstore;

    private Integer gcount;

    private Integer g_categoryId;

    public Integer getG_categoryId() {
        return g_categoryId;
    }

    public void setG_categoryId(Integer g_categoryId) {
        this.g_categoryId = g_categoryId;
    }

    private Integer gaId;
    //一个商品中对应多个图片
    private List<Goodimage> goodimages;
    public List<Goodimage> getGoodimages() {
        return goodimages;
    }

    public void setGoodimages(List<Goodimage> goodimages) {
        this.goodimages = goodimages;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGprice() {
        return gprice;
    }

    public void setGprice(String gprice) {
        this.gprice = gprice == null ? null : gprice.trim();
    }

    public String getGproductid() {
        return gproductid;
    }

    public void setGproductid(String gproductid) {
        this.gproductid = gproductid == null ? null : gproductid.trim();
    }

    public String getGbrand() {
        return gbrand;
    }

    public void setGbrand(String gbrand) {
        this.gbrand = gbrand == null ? null : gbrand.trim();
    }

    public String getGpack() {
        return gpack;
    }

    public void setGpack(String gpack) {
        this.gpack = gpack == null ? null : gpack.trim();
    }

    public String getGaddress() {
        return gaddress;
    }

    public void setGaddress(String gaddress) {
        this.gaddress = gaddress == null ? null : gaddress.trim();
    }

    public String getGstore() {
        return gstore;
    }

    public void setGstore(String gstore) {
        this.gstore = gstore == null ? null : gstore.trim();
    }

    public Integer getGcount() {
        return gcount;
    }

    public void setGcount(Integer gcount) {
        this.gcount = gcount;
    }

    public Integer getGaId() {
        return gaId;
    }

    public void setGaId(Integer gaId) {
        this.gaId = gaId;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", gprice='" + gprice + '\'' +
                ", gproductid='" + gproductid + '\'' +
                ", gbrand='" + gbrand + '\'' +
                ", gpack='" + gpack + '\'' +
                ", gaddress='" + gaddress + '\'' +
                ", gstore='" + gstore + '\'' +
                ", gcount=" + gcount +
                ", g_categoryId=" + g_categoryId +
                ", gaId=" + gaId +
                ", goodimages=" + goodimages +
                '}';
    }
}