package com.example.makeparser;

public class Hospital {
    private String name;

    private String webSiteAddr;

    public String getName() {
        return name;
    }

    public String getWebSiteAddr() {
        return webSiteAddr;
    }

    public Address getAddress() {
        return address;
    }

    private Address address;
    public Hospital(String name, String webSiteAddr, Address address) {
        this.name = name;
        this.webSiteAddr = webSiteAddr;
        this.address = address;
    }
}


