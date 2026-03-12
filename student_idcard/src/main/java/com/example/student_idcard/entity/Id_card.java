package com.example.student_idcard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Id_card {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long card_id;

    private String father_name;

    public Id_card(){}

    public Id_card(String f){
        this.father_name=f;
    }

    public Long getCard_id() {
        return card_id;
    }

    public void setCard_id(Long card_id) {
        this.card_id = card_id;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    

    
    
}
