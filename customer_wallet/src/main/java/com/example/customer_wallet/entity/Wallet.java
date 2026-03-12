package com.example.customer_wallet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Wallet {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long walletId;

    private double balance;
    private int walletNumber;

    public Wallet(){}

    public Wallet(double b,int w){
        this.balance=b;
        this.walletNumber=w;
    }

    public Long getWalletId() {
        return walletId;
    }

    public void setWalletId(Long walletId) {
        this.walletId = walletId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getWalletNumber() {
        return walletNumber;
    }

    public void setWalletNumber(int walletNumber) {
        this.walletNumber = walletNumber;
    }

    
    
}
