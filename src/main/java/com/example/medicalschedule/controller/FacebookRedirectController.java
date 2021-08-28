package com.example.medicalschedule.controller;

import com.example.medicalschedule.bo.MessageRequest.FacebookMessages;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/webhook")
public class FacebookRedirectController {



    @Value("${facebook.verifyToken}")
    String VERIFY_TOKEN ;

	//"entry": [{"messaging": [{"message": "TEST_MESSAGE"}]}]
	@PostMapping
	public ResponseEntity<String> receiveMessage(
			@RequestBody FacebookMessages message
			) {
		if (message.getType().equals("page")) {
			message.getEntry().forEach(el -> {
				log.info(el.getMessageContents().get(0).getMessage());
			});
			return ResponseEntity.ok("EVENT_RECEIVED");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);

	}

	@GetMapping
	public ResponseEntity<String> verify(
            @RequestParam(name="hub.mode") String mode,
            @RequestParam(name = "hub.verify_token") String verifyToken,
            @RequestParam(name = "hub.challenge") String challenge

	) {
        if (mode.equals("subscribe") && verifyToken.equals(VERIFY_TOKEN)) {

			log.info("WEBHOOK_VERIFIED");
            // Responds with the challenge token from the request
            return ResponseEntity.ok(challenge);

        } else {
            // Responds with '403 Forbidden' if verify tokens do not match
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

	}

}
