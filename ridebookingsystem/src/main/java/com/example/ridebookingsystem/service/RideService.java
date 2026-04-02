package com.example.ridebookingsystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ridebookingsystem.dto.RequestDto;
import com.example.ridebookingsystem.dto.ResponseDto;
import com.example.ridebookingsystem.entity.Driver;
import com.example.ridebookingsystem.entity.Ride;
import com.example.ridebookingsystem.entity.User;
import com.example.ridebookingsystem.repository.DriverRepo;
import com.example.ridebookingsystem.repository.RideRepo;
import com.example.ridebookingsystem.repository.UserRepo;

@Service
public class RideService {

    final UserRepo userR;
    final DriverRepo driverR;
    final RideRepo rideR;

    public RideService(UserRepo u, DriverRepo d, RideRepo r) {
        this.userR = u;
        this.driverR = d;
        this.rideR = r;
    }

    public ResponseDto bookRide(RequestDto dto){
        User user=userR.findById(dto.getUser_id()).orElseThrow(()-> new RuntimeException("User Not Found"));
        
        Driver driver=driverR.findById(dto.getDriver_id()).orElseThrow(()-> new RuntimeException("Driver Not Found"));

        Ride ride=new Ride();
        ride.setUser(user);
        ride.setDriver(driver);
        ride.setDistance(dto.getDistance());
        ride.setBaseFare(dto.getBaseFare());
        ride.setSurgeMultiplier(dto.getSurgeMultiplier());

        rideR.save(ride);

        return convertRideToDto(ride);

    }

    public User createUser(User user){
        return userR.save(user);
    }

    public Driver createDriver(Driver driver){
        return driverR.save(driver);
    }


    public ResponseDto getRideById(Long id) {
        Ride ride = rideR.findById(id).orElseThrow(() -> new RuntimeException("Ride Not Found Bhai!!!"));

        return convertRideToDto(ride);
    }

    public List<ResponseDto> getAllRide() {
        List<Ride> ride = rideR.findAll();
        List<ResponseDto> list = new ArrayList<>();

        for (Ride r : ride) {
            list.add(convertRideToDto(r));

        }
        return list;
    }

   

    public ResponseDto updateRide(Long id, int surgeMultiplier) {
        Ride r = rideR.findById(id).orElseThrow(() -> new RuntimeException("Ride not Found" + id));

        r.setSurgeMultiplier(surgeMultiplier);
        Ride saved = rideR.save(r);

        return convertRideToDto(saved);

    }

    

    public String cancelRide(Long id) {
        Ride ride=rideR.findById(id).orElseThrow(()-> new RuntimeException("Ride Not Found"));

        rideR.delete(ride);

        return "Ride Cancelled Successfully";
    }


    private ResponseDto convertRideToDto(Ride ride) {
        ResponseDto rideDto = new ResponseDto();
        rideDto.setUserName(ride.getUser().getName());
        rideDto.setDriverName(ride.getDriver().getName());
        rideDto.setFinalFare(ride.getBaseFare() * ride.getSurgeMultiplier());

        return rideDto;
    }


}
