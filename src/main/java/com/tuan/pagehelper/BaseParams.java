package com.tuan.pagehelper;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by buzheng on 17/8/13.
 * 一个用于返回信息给客户端的数据类
 */
public class BaseParams {

    public String mBook;

    public String getmBook() {
        return mBook;
    }

    public void setmBook(String mBook) {
        this.mBook = mBook;
    }

    /**
     * 解析mbook
     *
     * @param key 属性key
     */
    public String parseMbook(String key) {
        StringBuilder dest = new StringBuilder();
        if (StringUtils.isNotBlank(mBook)) {
            Gson gson = new Gson();
            JsonElement obj = gson.toJsonTree(mBook);
            if (obj.isJsonObject() && obj.getAsJsonObject().get(key) != null) {
                dest.append(obj.getAsJsonObject().get(key).getAsString());
            }
        }
        return dest.toString();
    }


}
