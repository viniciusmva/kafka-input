package com.org.kafkainput.config;

import com.org.kafkainput.infrastructure.KafkaChannels;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(KafkaChannels.class)
public class KafkaConfig {
}