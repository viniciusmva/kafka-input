package com.org.kafkainput.service;

import com.org.kafkainput.entity.InputEntity;
import com.org.kafkainput.infrastructure.listner.dto.MessageDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class InputService {

    public InputEntity getMessage(MessageDTO messageDTO){
        ModelMapper modelMapper = new ModelMapper();
        InputEntity input = modelMapper.map(messageDTO, InputEntity.class);
        input.setRandom("random");
        System.out.println(input);
        return input;
    }
}
