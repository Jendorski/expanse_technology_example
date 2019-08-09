package com.expanse.test.project.expanseproject.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ErrorModel {

    @SerializedName("code")
    @Expose
    private long code;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("info")
    @Expose
    private String info;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
