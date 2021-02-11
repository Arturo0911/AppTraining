package com.example.trainingregister.process;

public class Trainer {

    private String name;
    private String lastnames;
    private String latitude;
    private String longitude;

    public Trainer(){}

    public Trainer(String name, String lastnames, String latitude, String longitude) {
        this.name = name;
        this.lastnames = lastnames;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastnames() {
        return lastnames;
    }

    public void setLastnames(String lastnames) {
        this.lastnames = lastnames;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }




}
