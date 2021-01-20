package com.frankieci.concurrency.prometheus;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

public class PromeLabelUtil {

    public static String getLabel(JSONObject labels, String label, String defaultValue) {
        if (labels == null) {
            return defaultValue;
        }
        String result = labels.getString(label);
        if (StringUtils.isNotEmpty(result)) {
            return result;
        }
        return defaultValue;
    }
}
