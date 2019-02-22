package com.maz.eventCalender.model;



import java.util.List;

public class LoadEventResponse {

    private String responseCode;
    private String message;

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

    public List<Event> getResponse() {
        return response;
    }

    public void setResponse(List<Event> response) {
        this.response = response;
    }

    private List<Event> response;


}
