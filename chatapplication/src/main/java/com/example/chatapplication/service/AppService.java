package com.example.chatapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.chatapplication.dto.RequestDto;
import com.example.chatapplication.dto.ResponseDto;
import com.example.chatapplication.entity.App;
import com.example.chatapplication.entity.Receiver;
import com.example.chatapplication.entity.Sender;
import com.example.chatapplication.exception.ResourceNotFoundException;
import com.example.chatapplication.repository.AppRepo;
import com.example.chatapplication.repository.ReceiverRepo;
import com.example.chatapplication.repository.SenderRepo;

@Service
public class AppService {

    private final AppRepo arepo;
    private final SenderRepo srepo;
    private final ReceiverRepo rrepo;

    public AppService(AppRepo a,SenderRepo s,ReceiverRepo r){
        this.arepo=a;
        this.srepo=s;
        this.rrepo=r;
    }

    public ResponseDto sendMessage(RequestDto dto) throws ResourceNotFoundException{
        Sender sender=srepo.findById(dto.getSender_id()).orElseThrow(()-> new ResourceNotFoundException("Sender Not Found Veere"));

        Receiver receiver=rrepo.findById(dto.getReceiver_id()).orElseThrow(()-> new ResourceNotFoundException("Receiver Not Found Bhaiya!"));

        App app=new App();
        app.setReceiver(receiver);
        app.setSender(sender);
        app.setMessage(dto.getMessage());

        App saved=arepo.save(app);

        return convertToDto(saved);

    }

    public List<ResponseDto> getAllSendMessage(){
        List<App> app=arepo.findAll();
        List<ResponseDto> list=new ArrayList<>();
        for(App a:app){
            list.add(convertToDto(a));
        }

        return list;
    }

    public ResponseDto getMessagesById(Long id) throws ResourceNotFoundException{
        App app=arepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("App Id Not Found"));

        return convertToDto(app);
    }

    public ResponseDto updateMessages(Long id,String message) throws ResourceNotFoundException{
        App app=arepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("App Id Not Found"));

        app.setMessage(message);

        App saved=arepo.save(app);

        return convertToDto(saved);

    }
        
    private ResponseDto convertToDto(App app){
        ResponseDto dto=new ResponseDto();
        dto.setSenderName(app.getMessage());
        dto.setMessage(app.getMessage());

        return dto;
    }
    
}
