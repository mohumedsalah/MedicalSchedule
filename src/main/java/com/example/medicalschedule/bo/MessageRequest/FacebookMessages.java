package com.example.medicalschedule.bo.MessageRequest;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
// {"object": "page", "entry": [{"messaging": [{"message": "TEST_MESSAGE"}]}]}
public class FacebookMessages {
	@JsonProperty("object")
	private String type;
	private List<Messaging> entry ;


}

