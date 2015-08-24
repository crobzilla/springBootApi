package com.crobzilla.api.model;

import java.util.List;

public class Address {

    private String building;
    private List<Float> coord;
    private String street;
    private String zipcode;

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public List<Float> getCoord() {
        return coord;
    }

    public void setCoord(List<Float> coord) {
        this.coord = coord;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
