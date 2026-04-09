package com.example.chatapplication.dto;

public class ResponseDto {
    

    String senderName;
    String message;

    public ResponseDto(){};

    public ResponseDto(String s,String m){
        this.senderName=s;
        this.message=m;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
}
