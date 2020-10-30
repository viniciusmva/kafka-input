package com.org.kafkainput.infrastructure;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface KafkaChannels {
    String TEST_INPUT = "org-test-input";

    @Input(TEST_INPUT)
    SubscribableChannel testInput();
}
