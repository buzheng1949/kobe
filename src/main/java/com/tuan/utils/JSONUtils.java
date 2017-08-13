package com.tuan.utils;

import com.oracle.javafx.jmx.json.JSONException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * Created by buzheng on 17/8/13.
 */
public class JSONUtils {
    public static <T> Object JSONToObj(String jsonStr, Class<T> obj) {
        T t = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            t = objectMapper.readValue(jsonStr,
                    obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

}
