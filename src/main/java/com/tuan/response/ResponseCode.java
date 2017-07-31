package com.tuan.response;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by buzheng on 17/8/1.
 * 统一的返回状态码
 */
@JsonSerialize
public enum ResponseCode {

    SUCCESS(1001, "SUCCESS"),
    FAILED(1002, "FAILED"),
    NEED_LOGIN(1003, "NEED_LOGIN"),
    ILLEGAL_ARGUMENT(1004, "ILLEGAL_ARGUMENT");

    private Integer code;
    private String des;

    ResponseCode(Integer code, String des) {
        this.code = code;
        this.des = des;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    /**
     * 判断是否是返回成功
     *
     * @return
     */
    @JsonIgnore
    public boolean isSuccess() {
        return code == 1001;
    }
}
