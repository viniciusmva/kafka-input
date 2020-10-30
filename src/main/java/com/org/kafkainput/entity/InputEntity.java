package com.org.kafkainput.entity;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InputEntity {
    String title;
    String message;
    String random;
}
