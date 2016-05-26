package io.khasang.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Message {
    public Message() {
    }

    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    private String helloMessage;
}
