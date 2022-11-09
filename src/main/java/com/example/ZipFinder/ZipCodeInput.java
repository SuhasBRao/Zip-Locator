package com.example.ZipFinder;

public class ZipCodeInput {

    private long code;

    private String url;
    
    public long getCode(){
        return code;
    }

    public void setCode(long zipCode){
        this.code = zipCode;
    }

    public ZipCodeInput(){}
    
    public String getLink(){
        url = "https://api.postalpincode.in/pincode/"+ code;
        return url;
    }
    
}
