package com.example.ZipFinder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Places {

    @JsonProperty("Name")
    private String placeName;

    @JsonProperty("BranchType")
    private String branchType;

    @JsonProperty("Circle")
    private String circle;

    @JsonProperty("Division")
    private String division;

    @JsonProperty("Region")
    private String region;

    @JsonProperty("State")
    private String state;

    @JsonProperty("District")
    private String district;

    @JsonProperty("Country")
    private String country;

    public Places(){
    }

    
    public String getPlaceName() {
        return placeName;
    }


    public String getBranchType() {
        return branchType;
    }


    public String getCircle() {
        return circle;
    }


    public String getDivision() {
        return division;
    }


    public String getRegion() {
        return region;
    }


    public String getState() {
        return state;
    }


    public String getDistrict() {
        return district;
    }


    public String getCountry() {
        return country;
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
            ", branch Type='" + branchType +
            ", circle='" + circle +
            ", District=" + district +
            ", Division=" + division +
            ", Region=" + region +
            "state= "+ state + 
            ",Country= "+ country + '\'' +
            '}';
    }
}
