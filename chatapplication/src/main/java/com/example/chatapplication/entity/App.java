package com.example.chatapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class App {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    Long senderId;
    Long receiverId;
    String message;
    Boolean isDeleted;

    @ManyToOne
    @JoinColumn(name="sender_id")
    private Sender sender;

    @ManyToOne
    @JoinColumn(name="receiver_id")
    private Receiver receiver;

    public App(){};

    public App(Long s,Long r, String m,Boolean i){
        this.senderId=s;
        this.receiverId=r;
        this.message=m;
        this.isDeleted=false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }    

    
}
