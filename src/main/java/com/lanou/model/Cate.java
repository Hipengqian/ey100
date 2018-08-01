package com.lanou.model;

import java.util.List;

public class Cate {
    private Integer categoryid;

    private String name;

    private Integer parentid;

    private Integer type;

    private List<Cate> list;

    public List<Cate> getList() {
        return list;
    }

    public void setList(List<Cate> list) {
        this.list = list;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}