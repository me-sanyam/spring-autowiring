package com.spring.beans;

public class Address {

    private int houseNo;
    private String city;
    private String state;
    private String location;
    private int zipCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String country) {
        this.location = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String addressDisplay() {
        return "Hno. "+this.houseNo+" "+this.location+" "+this.city+" "+this.state+" -: Zip Code - "+this.zipCode;
    }
}
