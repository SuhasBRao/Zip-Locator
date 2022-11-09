package com.example.ZipFinder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultData {
    
    @JsonProperty("Message")
    private String message;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("PostOffice")
    private Places[] place;

    public ResultData(){
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public Places[] getPlace() {
        return place;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPlace(Places[] place) {
        this.place = place;
    }

    @Override
    public String toString() {
      return "ZipData{" +
          "Message=" + message +
          ", status=" + status +
          ", PostOffice= '" + place[0].toString()+ '\'' +
          '}';
    }
    
}
