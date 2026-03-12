package com.example.customer_wallet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customer_wallet.entity.Wallet;

public interface WalletRepo extends JpaRepository<Wallet, Long> {


}
