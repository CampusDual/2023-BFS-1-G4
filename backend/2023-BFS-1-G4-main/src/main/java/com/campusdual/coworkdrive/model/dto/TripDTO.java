package com.campusdual.coworkdrive.model.dto;

import java.sql.Time;
import java.util.Date;

public class TripDTO {
    
    private Integer id_trip;
    
    
    private String origin;
    
   
    private String destination;
    
    
    private Date date;
    
    
    private Time hour;
    
    public Integer getId_trip() {
        return id_trip;
    }
    
    public void setId_trip(Integer id_trip) {
        this.id_trip = id_trip;
    }
    
    public String getOrigin() {
        return origin;
    }
    
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public Time getHour() {
        return hour;
    }
    
    public void setHour(Time hour) {
        this.hour = hour;
    }
}