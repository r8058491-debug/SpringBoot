package com.example.subscriptionsystem.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
// import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.subscriptionsystem.dto.RequestDto;
import com.example.subscriptionsystem.dto.ResponseDto;
import com.example.subscriptionsystem.entity.SubscriptionApp;
import com.example.subscriptionsystem.entity.User;
import com.example.subscriptionsystem.repository.SubscriptionAppRepo;
import com.example.subscriptionsystem.repository.UserRepo;

@Service
public class SubscriptionAppService {
    @Autowired
    private SubscriptionAppRepo srepo;

    @Autowired
    private UserRepo urepo;

    public ResponseDto takeSubscription(RequestDto dto) {
        User user = urepo.findById(dto.getUser_id())
                .orElseThrow(() -> new RuntimeException("Subscription Scheme Not Found..."));

        SubscriptionApp app = new SubscriptionApp();
        app.setStartDate(dto.getStartDate());
        app.setEndDate(dto.getEndDate());
        app.setPlanType(dto.getPlanType());
        app.setUser(user);

        SubscriptionApp saved = srepo.save(app);

        return convertToDto(saved);
    }

    public User createUser(User user) {
        return urepo.save(user);
    }

    public List<User> getAllUser(){
        return urepo.findAll();
    }

    public List<ResponseDto> getAll() {
        List<SubscriptionApp> app = srepo.findAll();
        List<ResponseDto> list = new ArrayList<>();

        for (SubscriptionApp s : app) {
            list.add(convertToDto(s));
        }
        return list;
    }

    public ResponseDto getSubscriptionById(Long id) {
        SubscriptionApp app = srepo.findById(id).orElseThrow(() -> new RuntimeException("Not Found!!"));

        return convertToDto(app);
    }

    public ResponseDto updateSubscription(Long id, SubscriptionApp app) {
        SubscriptionApp a = srepo.findById(id).orElseThrow(() -> new RuntimeException("Resource Not Found!!!"));
        a.setStartDate(app.getStartDate());
        a.setEndDate(app.getEndDate());
        a.setPlanType(app.getPlanType());

        SubscriptionApp saved = srepo.save(a);

        return convertToDto(saved);
    }

    public String cancelSubscription(Long id) {
        SubscriptionApp app = srepo.findById(id)
                .orElseThrow(() -> new RuntimeException("You are already Not subscribed"));

        srepo.delete(app);

        return "Cancelled Subscription Successfully !";
    }

    private ResponseDto convertToDto(SubscriptionApp app) {
        ResponseDto dto = new ResponseDto();
        dto.setUserName(app.getUser().getName());
        dto.setPlanType(app.getPlanType());

        // bhaiyo yeh kiya hai maine do date ka difference nikalne ke liye
        Long days=ChronoUnit.DAYS.between(LocalDate.now(),app.getEndDate());
        
        dto.setDaysRemaining(days > 0 ? days : null);
        dto.setStatus(days > 0 ? "Active " : "Expired");

        return dto;

    }
}
