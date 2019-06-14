package com.penghui.beanFacoryPostProcessorTest.entity;

public class Address {
    private String detail;
    private String jiedao;
    private String chengqu;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getJiedao() {
        return jiedao;
    }

    public void setJiedao(String jiedao) {
        this.jiedao = jiedao;
    }

    public String getChengqu() {
        return chengqu;
    }

    public void setChengqu(String chengqu) {
        this.chengqu = chengqu;
    }

    @Override
    public String toString() {
        return "Address{" +
                "detail='" + detail + '\'' +
                ", jiedao='" + jiedao + '\'' +
                ", chengqu='" + chengqu + '\'' +
                '}';
    }
}
