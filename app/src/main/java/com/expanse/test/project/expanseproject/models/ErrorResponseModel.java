package com.expanse.test.project.expanseproject.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ErrorResponseModel {

    @SerializedName("success")
    @Expose
    private boolean success;

    @SerializedName("error")
    @Expose
    private ErrorModel error;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ErrorModel getError() {
        return error;
    }

    public void setError(ErrorModel error) {
        this.error = error;
    }

}