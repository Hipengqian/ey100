package com.lanou.model;

public class Goodattribute {
    private Integer gaid;

    private String gabrand;

    private String gacolor;

    private String gasize;

    private String gaweight;

    private String gaquality;

    public Integer getGaid() {
        return gaid;
    }

    public void setGaid(Integer gaid) {
        this.gaid = gaid;
    }

    public String getGabrand() {
        return gabrand;
    }

    public void setGabrand(String gabrand) {
        this.gabrand = gabrand == null ? null : gabrand.trim();
    }

    public String getGacolor() {
        return gacolor;
    }

    public void setGacolor(String gacolor) {
        this.gacolor = gacolor == null ? null : gacolor.trim();
    }

    public String getGasize() {
        return gasize;
    }

    public void setGasize(String gasize) {
        this.gasize = gasize == null ? null : gasize.trim();
    }

    public String getGaweight() {
        return gaweight;
    }

    public void setGaweight(String gaweight) {
        this.gaweight = gaweight == null ? null : gaweight.trim();
    }

    public String getGaquality() {
        return gaquality;
    }

    public void setGaquality(String gaquality) {
        this.gaquality = gaquality == null ? null : gaquality.trim();
    }

    @Override
    public String toString() {
        return "Goodattribute{" +
                "gaid=" + gaid +
                ", gabrand='" + gabrand + '\'' +
                ", gacolor='" + gacolor + '\'' +
                ", gasize='" + gasize + '\'' +
                ", gaweight='" + gaweight + '\'' +
                ", gaquality='" + gaquality + '\'' +
                '}';
    }
}