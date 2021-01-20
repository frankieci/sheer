package com.frankieci.concurrency.prometheus;

import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.JSONObject;

import java.text.ParseException;

public class PromeAlert {

    private static final String DATE_FORMAT_RFC_3339 = "yyyy-MM-dd'T'HH:mm:ssXXX";
    private static final Logger logger = LoggerFactory.getLogger(PromeAlert.class);

    private String status;
    private JSONObject labels;
    private PromeAlterAnnotations annotations;
    private String startsAt;
    private String endsAt;
    private String generatorURL;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JSONObject getLabels() {
        return labels;
    }

    public void setLabels(JSONObject labels) {
        this.labels = labels;
    }

    public PromeAlterAnnotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(PromeAlterAnnotations annotations) {
        this.annotations = annotations;
    }

    public String getStartsAt() {
        return startsAt;
    }

    public long getStartAtTimestamp() {
        return parseTime(this.startsAt);
    }

    public void setStartsAt(String startsAt) {
        this.startsAt = startsAt;
    }

    public long getEndsAtTimestamp() {
        return parseTime(this.endsAt);
    }

    public void setEndsAt(String endsAt) {
        this.endsAt = endsAt;
    }

    public String getGeneratorURL() {
        return generatorURL;
    }

    public void setGeneratorURL(String generatorURL) {
        this.generatorURL = generatorURL;
    }

    private long parseTime(String timeStr) {
        if (startsAt != null) {
            try {
                DateUtils.parseDate(this.startsAt, DATE_FORMAT_RFC_3339);
            } catch (ParseException e) {
                logger.error("Parse prometheus alert time failed", e);
            }
        }
        return -1;
    }

    public String getLabel(String label, String defaultValue) {
        return PromeLabelUtil.getLabel(this.labels, label, defaultValue);
    }
}
