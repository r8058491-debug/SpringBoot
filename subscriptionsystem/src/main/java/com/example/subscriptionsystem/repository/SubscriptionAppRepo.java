package com.example.subscriptionsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.subscriptionsystem.entity.SubscriptionApp;

@Repository
public interface SubscriptionAppRepo extends JpaRepository<SubscriptionApp,Long>{
    
}
