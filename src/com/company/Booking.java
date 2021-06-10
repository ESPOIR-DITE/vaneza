package com.company;

public class Booking {
    private String id;
    private String descrition;

    public Booking(String id, String descrition) {
        this.id = id;
        this.descrition = descrition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }
}
