package com.example.ZipFinder;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ZipData {
    
    @JsonProperty("post code")
    private String postCode;

    @JsonProperty("country")
    private String country;

    // @JsonProperty("country abbreviation")
    // private String countryAbbr;

    @JsonProperty("places")
    private Places[] place;

    public ZipData(){
    }

    public String getPostCode(){
        return postCode;
    }

    public void setPostCode(String postCode){
        this.postCode = postCode;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public Places[] getPlace(){
        return place;
    }

    public void setPlace(Places[] place){
        this.place = place;
    }


    @Override
    public String toString() {
      return "ZipData{" +
          "postCode=" + postCode +
          ", country=" + country +
          ", place= '" + place[0].toString()+ '\'' +
          '}';
    }
    
}
