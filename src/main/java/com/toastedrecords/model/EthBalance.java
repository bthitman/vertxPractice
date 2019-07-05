package com.toastedrecords.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EthBalance {
    private boolean requestStatus;
    private Number data;
    private String error;

    @JsonProperty("status")
    public boolean isRequestStatus() {
        return requestStatus;
    }

    @JsonProperty("status")
    public void setRequestStatus(boolean status) {
        this.requestStatus = status;
    }

    public Number getData() {
        return data;
    }

    public void setData(Number data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "EthBalance{" +
                "status=" + requestStatus +
                ", data=" + data +
                ", error='" + error + '\'' +
                '}';
    }
}
