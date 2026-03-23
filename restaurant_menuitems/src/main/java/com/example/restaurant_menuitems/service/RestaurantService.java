package com.example.restaurant_menuitems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restaurant_menuitems.entity.Menu;
import com.example.restaurant_menuitems.entity.Restaurant;
import com.example.restaurant_menuitems.repository.MenuRepo;
import com.example.restaurant_menuitems.repository.RestaurantRepo;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepo rrepo;

    @Autowired
    private MenuRepo mrepo;

    public Restaurant createRestaurant(Restaurant restaurant) {

        for(Menu m:restaurant.getMenu()){
            m.setRestaurant(restaurant);
        }
        return rrepo.save(restaurant);
    }

    public List<Menu> getAlls(){
        return mrepo.findAll();
    }
    public List<Restaurant> getAll(){
        return rrepo.findAll();
    }

    public Restaurant getMenuItems(Long restaurant_id) {
        return rrepo.findById(restaurant_id).orElseThrow(()-> new RuntimeException("Error :"+restaurant_id));
    }

    // public Restaurant updatePrice(Long id,Restaurant restaurant){
    //     Restaurant r=rrepo.findById(id).orElseThrow(()-> new RuntimeException("Error Detected :"+id));
    //     for(Menu m:restaurant.getMenu()){
    //         m.setPrice(m.getPrice());
    //     }
    //     return rrepo.save(r);
    // }

    public Menu updatePrice(Long id,Menu menu){
        Menu m=mrepo.findById(id).orElseThrow(()-> new RuntimeException("Error"+id));
        m.setPrice(menu.getPrice());
        return mrepo.save(m);
    }

    public Restaurant deleteMenuFromRestaurant(Long rid,Long mid){
        // Restaurant Fetch
        Restaurant r=rrepo.findById(rid).orElseThrow(()-> new RuntimeException("Restaurant Not Found "));

        // Menu List se Remove
        r.getMenu().removeIf(menu -> menu.getId().equals(mid));

        // Save Restaurant
        return rrepo.save(r);

     }

     public String deleteMenu(Long id){
        mrepo.deleteById(id);
        return "deleted";
     }
}
