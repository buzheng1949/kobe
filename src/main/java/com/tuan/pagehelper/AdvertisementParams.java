package com.tuan.pagehelper;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.tuan.utils.JSONUtils;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.math.NumberUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.util.JSONPObject;

import java.io.UnsupportedEncodingException;

/**
 * Created by buzheng on 17/8/13.
 */
public class AdvertisementParams extends BaseParams {

    public static String buildMbook(Integer page, Integer pageSize) {
        JsonObject obj = new JsonObject();
        if (page != null) {
            obj.addProperty("page", page);
        }
        if (pageSize != null) {
            obj.addProperty("pageSize", pageSize);
        }
        byte[] encodeBase64Mbook = null;
        try {
            encodeBase64Mbook = Base64.encodeBase64(obj.toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return new String(encodeBase64Mbook);
    }

    public int getPage() {
        return NumberUtils.toInt(parseMbook("page"), 1);
    }

    public int getPageSize() {
        return NumberUtils.toInt(parseMbook("pageSize"), 10);
    }

    private int page;

    private int pageSize;

    public void setPage(int page) {
        this.page = page;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 字符串转目标对象
     *
     * @param message
     * @return
     */
    public static AdvertisementParams covertToAdvertisementParams(String message) {
        byte[] asBytes = Base64.decodeBase64(message);
        try {
            message = new String(asBytes, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        AdvertisementParams advertisementParams = new AdvertisementParams();
        advertisementParams.setmBook(message);
        Object object = JSONUtils.JSONToObj(message, AdvertisementParams.class);
        if (object instanceof AdvertisementParams) {
            advertisementParams = (AdvertisementParams) object;
        }
        return advertisementParams;
    }


}
