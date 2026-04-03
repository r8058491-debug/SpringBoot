package com.example.subscriptionsystem.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SubscriptionApp {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    
    LocalDate startDate;
    LocalDate endDate;
    String planType;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public SubscriptionApp(){};

    public SubscriptionApp(LocalDate s,LocalDate e,String p){
        this.startDate=s;
        this.endDate=e;
        this.planType=p;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
}
