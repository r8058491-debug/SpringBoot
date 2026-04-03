package com.example.subscriptionsystem.dto;

import java.time.LocalDate;

public class ResponseDto {

    String userName;
    String planType;
    Long daysRemaining;
    String status;

    public ResponseDto(){};

    public ResponseDto(String u,String p, Long d, String s){
        this.userName=u;
        this.planType=p;
        this.daysRemaining=d;
        this.status=s;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public Long getDaysRemaining() {
        return daysRemaining;
    }

    public void setDaysRemaining(Long daysRemaining) {
        this.daysRemaining = daysRemaining;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private static Long calculateDaysRemaining(LocalDate date) {
        return date.toEpochDay() - LocalDate.now().toEpochDay();
    }

    private static String calculateStatus(LocalDate date){
        return calculateDaysRemaining(date)>0?"Active":"Expired";
    }
    

    
    
}
