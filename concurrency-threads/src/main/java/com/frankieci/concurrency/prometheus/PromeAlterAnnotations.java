package com.frankieci.concurrency.prometheus;

public class PromeAlterAnnotations {

    private String description;
    private String summary;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return (this.summary == null ? "" : this.summary) + "; "
                + (this.description == null ? "" : this.description);
    }
}
