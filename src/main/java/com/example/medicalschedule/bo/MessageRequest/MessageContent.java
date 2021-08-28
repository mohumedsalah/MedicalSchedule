package com.example.medicalschedule.bo.MessageRequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Getter
@Setter
public class MessageContent implements Serializable {
    private String message;
}
