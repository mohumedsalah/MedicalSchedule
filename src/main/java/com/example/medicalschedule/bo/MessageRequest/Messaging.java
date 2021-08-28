package com.example.medicalschedule.bo.MessageRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@ToString
@Getter
@Setter
public class Messaging implements Serializable {
    @JsonProperty("messaging")
    private List<MessageContent> messageContents;


}

