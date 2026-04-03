package com.example.subscriptionsystem.dto;

import java.time.LocalDate;

public class RequestDto {
    Long user_id;
    LocalDate startDate;
    LocalDate endDate;
    String planType;
    

    public RequestDto(){};

    public RequestDto(Long u,LocalDate s,LocalDate e, String p){
        this.user_id=u;
        this.startDate=s;
        this.endDate=e;
        this.planType=p;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    
    
}
