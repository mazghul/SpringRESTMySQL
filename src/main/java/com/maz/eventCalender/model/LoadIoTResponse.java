package com.maz.eventCalender.model;


import java.util.List;

public class LoadIoTResponse {

    private String responseCode;
    private String message;
    private List<IotMan> response;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<IotMan> getResponse() {
        return response;
    }

    public void setResponse(List<IotMan> response) {
        this.response = response;
    }


}
