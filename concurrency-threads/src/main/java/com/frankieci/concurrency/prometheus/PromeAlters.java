package com.frankieci.concurrency.prometheus;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class PromeAlters {

    private String version;
    private String groupKey;
    private String truncatedAlerts;
    private String status;
    private String receiver;

    private JSONObject groupLabels;
    private JSONObject commonLabels;
    private PromeAlterAnnotations commonAnnotations;

    private String externalURL;

    private List<PromeAlert> alters;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGroupKey() {
        return groupKey;
    }

    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    public String getTruncatedAlerts() {
        return truncatedAlerts;
    }

    public void setTruncatedAlerts(String truncatedAlerts) {
        this.truncatedAlerts = truncatedAlerts;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public JSONObject getGroupLabels() {
        return groupLabels;
    }

    public void setGroupLabels(JSONObject groupLabels) {
        this.groupLabels = groupLabels;
    }

    public JSONObject getCommonLabels() {
        return commonLabels;
    }

    public void setCommonLabels(JSONObject commonLabels) {
        this.commonLabels = commonLabels;
    }

    public PromeAlterAnnotations getCommonAnnotations() {
        return commonAnnotations;
    }

    public void setCommonAnnotations(PromeAlterAnnotations commonAnnotations) {
        this.commonAnnotations = commonAnnotations;
    }

    public String getExternalURL() {
        return externalURL;
    }

    public void setExternalURL(String externalURL) {
        this.externalURL = externalURL;
    }

    public List<PromeAlert> getAlters() {
        return alters;
    }

    public void setAlters(List<PromeAlert> alters) {
        this.alters = alters;
    }

    public String getLabel(String label, String defaultValue) {
        return PromeLabelUtil.getLabel(this.commonLabels, label, defaultValue);
    }
}
