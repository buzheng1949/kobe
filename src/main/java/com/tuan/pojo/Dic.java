package com.tuan.pojo;

public class Dic extends DicKey {
    private String name;

    private Integer weight;

    public Dic(String type, String code, String name, Integer weight) {
        super(type, code);
        this.name = name;
        this.weight = weight;
    }

    public Dic() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}