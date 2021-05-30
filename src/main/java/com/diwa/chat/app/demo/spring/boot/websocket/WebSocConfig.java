package com.diwa.chat.app.demo.spring.boot.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker //  enables WebSocket Server

// implements WebSocketMessageBrokerConfigurer
public class WebSocConfig implements WebSocketMessageBrokerConfigurer {


   // establish a connection
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").withSockJS();
    }


    //ConfigBroker
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {

        //destination method
        registry.setApplicationDestinationPrefixes("/app");
        //Broker name use to describe
        registry.enableSimpleBroker("/diwa");
    }
}
