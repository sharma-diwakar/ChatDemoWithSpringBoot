package com.diwa.chat.app.demo.spring.boot.websocket;

public class messageBean {

    private MessageType type;
    private String message;
    private String sender;


    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }


    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
