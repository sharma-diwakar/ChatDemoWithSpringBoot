package com.diwa.chat.app.demo.spring.boot.websocket;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatActionController {

    @MessageMapping("/chat.sendMessage")
    @SendTo("/diwa/public")
    public messageBean sendMessage(@Payload messageBean message) {
        return message;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/diwa/public")
    public messageBean addUser(@Payload messageBean message, SimpMessageHeaderAccessor headerAccessor) {

// set name in session
        headerAccessor.getSessionAttributes().put("username", message.getSender());
        return message;
    }

}
