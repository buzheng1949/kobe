package com.tuan.pagehelper;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.tuan.utils.JSONUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.util.JSONPObject;

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
        return obj.toString();
    }

    public int getPage() {
        return NumberUtils.toInt(parseMbook("page"), 1);
    }

    public int getPageSize() {
        return NumberUtils.toInt(parseMbook("pageSize"), 10);
    }

    /**
     * 字符串转目标对象
     *
     * @param message
     * @return
     */
    public static AdvertisementParams covertToAdvertisementParams(String message) {
        AdvertisementParams advertisementParams = new AdvertisementParams();
        Object object = JSONUtils.JSONToObj(message, AdvertisementParams.class);
        if (object instanceof AdvertisementParams) {
            advertisementParams = (AdvertisementParams) object;
        }
        return advertisementParams;
    }


}
