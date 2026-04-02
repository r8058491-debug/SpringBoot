package com.example.ridebookingsystem.dto;

public class RequestDto {

    Long user_id;
    Long driver_id;
    int distance;
    double baseFare;
    int surgeMultiplier;

    public RequestDto(){}

    public RequestDto(Long u,Long d,int distance,double b,int s){
        this.user_id=u;
        this.driver_id=d;
        this.distance=distance;
        this.baseFare=b;
        this.surgeMultiplier=s;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(Long driver_id) {
        this.driver_id = driver_id;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }

    public int getSurgeMultiplier() {
        return surgeMultiplier;
    }

    public void setSurgeMultiplier(int surgeMultiplier) {
        this.surgeMultiplier = surgeMultiplier;
    }

    
   
    

}    
    

