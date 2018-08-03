package com.lanou.model;

public class Office {
    private Integer osid;

    private String officescene;

    private String imageurl;

    private String describe;

    public Integer getOsid() {
        return osid;
    }

    public void setOsid(Integer osid) {
        this.osid = osid;
    }

    public String getOfficescene() {
        return officescene;
    }

    public void setOfficescene(String officescene) {
        this.officescene = officescene == null ? null : officescene.trim();
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}