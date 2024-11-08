package com.myproject.detector;

public class Trader {
    private String fullName;
    private String city;
    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getCity() {
        return city;
    }
    public String getFullName() {
        return fullName;
    }
}
