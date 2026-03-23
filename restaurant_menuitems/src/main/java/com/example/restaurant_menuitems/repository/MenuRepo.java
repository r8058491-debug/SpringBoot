package com.example.restaurant_menuitems.repository ;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restaurant_menuitems.entity.Menu;

@Repository
public interface MenuRepo extends JpaRepository<Menu,Long>{
    
}