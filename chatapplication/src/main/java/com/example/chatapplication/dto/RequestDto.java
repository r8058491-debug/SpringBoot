package com.example.chatapplication.dto;

public class RequestDto {
    Long receiver_id;
    Long sender_id;
    String message;



    public RequestDto(){};

    public RequestDto(Long r,Long s,String m){
        this.receiver_id=r;
        this.sender_id=s;
        this.message=m;
    }

    

    public Long getSender_id() {
        return sender_id;
    }

    public void setSender_id(Long sender_id) {
        this.sender_id = sender_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(Long receiver_id) {
        this.receiver_id = receiver_id;
    }

    


}
