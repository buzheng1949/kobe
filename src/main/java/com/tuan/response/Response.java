package com.tuan.response;

/**
 * Created by buzheng on 17/8/1.
 * 通用返回类
 */
public class Response<T> {

    private Integer code;
    private String msg;
    private String mBook;
    private T data;

    private Response(Integer code, String msg, T data, String mBook) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.mBook = mBook;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public String getmBook() {
        return mBook;
    }


    /**
     * 普通失败返回
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Response<T> errorByFailed(T data) {
        return new Response(ResponseCode.FAILED.getCode(), ResponseCode.FAILED.getDes(), data, "");
    }

    /**
     * 自定义返回类
     *
     * @param code
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Response<T> error(Integer code, String msg, T data) {
        return new Response(code, msg, data, "");
    }

    /**
     * 统一成功管理
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Response<T> success(T data) {
        return new Response<T>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDes(), data, "");
    }

    /**
     * 统一成功管理
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Response<T> success(T data, String mBook) {
        return new Response<T>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDes(), data, mBook);
    }
}
