package com.myorganisation.NotificationSystem.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class NotificationController {

    @Autowired
    SimpMessagingTemplate template;



    @GetMapping("/send-test-message")
    public ResponseEntity<?> sendMessage() {

        Date d1 = new Date();
        MessagePayload messagePayload = new MessagePayload("Test message from server at " + d1);

        template.convertAndSend("/topic/message", messagePayload);

        return new ResponseEntity<>("message sent!", HttpStatus.OK);
    }

    @Data
    public class MessagePayload {
        private String message;

        public MessagePayload(String message) {
            this.message = message;
        }
    }
}