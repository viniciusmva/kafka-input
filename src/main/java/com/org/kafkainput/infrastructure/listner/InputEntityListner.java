package com.org.kafkainput.infrastructure.listner;

import com.org.kafkainput.infrastructure.KafkaChannels;
import com.org.kafkainput.infrastructure.listner.dto.MessageDTO;
import com.org.kafkainput.service.InputService;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class InputEntityListner {

    private final InputService inputService;

    public InputEntityListner(InputService inputService) {
        this.inputService = inputService;
    }

    @StreamListener(KafkaChannels.TEST_INPUT)
    public void receive(MessageDTO dto) {
        inputService.getMessage(dto);
    }
}
