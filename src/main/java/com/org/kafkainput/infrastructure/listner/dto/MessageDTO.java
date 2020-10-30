package com.org.kafkainput.infrastructure.listner.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MessageDTO {
    String title;
    String message;
}
