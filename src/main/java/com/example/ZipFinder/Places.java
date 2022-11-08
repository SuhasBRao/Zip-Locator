package com.example.ZipFinder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Places {

    @JsonProperty("place name")
    private String placeName;

    @JsonProperty("longitude")
    private String longitude;

    @JsonProperty("latitude")
    private String latitude;

    @JsonProperty("state")
    private String state;

    @JsonProperty("state abbreviation")
    private String stateAbbr;

    public Places(){
    }

    public String getPlaceName(){
        return placeName;
    }

    public String getState(){
        return state;
    }

    public void setPlaceName(String placeName){
        this.placeName = placeName;
    }

    public void setState(String state){
        this.state = state;
    }

    @Override
    public String toString() {
        return "Places{" +
            "place name=" + placeName +
            ", longitude='" + longitude +
            ", latitude='" + latitude +
            "state= "+ state + '\'' +
            '}';
    }
}
