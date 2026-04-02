package com.example.ridebookingsystem.dto;

public class ResponseDto {
    
    String userName;
    String driverName;
    double finalFare;

    public ResponseDto(){}

    public ResponseDto(String u,String d, double f){
        this.userName=u;
        this.driverName=d;
        this.finalFare=f;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getFinalFare() {
        return finalFare;
    }

    public void setFinalFare(double finalFare) {
        this.finalFare = finalFare;
    }

    
    
}
