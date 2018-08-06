package com.lanou.model;

public class Orders {
    private Integer oid;

    private String orderProductid;

    private String state;

    private Integer ordernumber;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOrderProductid() {
        return orderProductid;
    }

    public void setOrderProductid(String orderProductid) {
        this.orderProductid = orderProductid == null ? null : orderProductid.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }
}