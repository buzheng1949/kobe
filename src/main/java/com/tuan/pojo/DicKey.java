package com.tuan.pojo;

public class DicKey {
    private String type;

    private String code;

    public DicKey(String type, String code) {
        this.type = type;
        this.code = code;
    }

    public DicKey() {
        super();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}