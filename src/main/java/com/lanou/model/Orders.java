package com.lanou.model;

import java.util.List;

public class Orders {
    private Integer oid;

    private String oGproductid;

    private Integer onumber;

    //保存goods
    private List<Goods> goods;

    public Orders() {
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getoGproductid() {
        return oGproductid;
    }

    public void setoGproductid(String oGproductid) {
        this.oGproductid = oGproductid == null ? null : oGproductid.trim();
    }

    public Integer getOnumber() {
        return onumber;
    }

    public void setOnumber(Integer onumber) {
        this.onumber = onumber;
    }
}