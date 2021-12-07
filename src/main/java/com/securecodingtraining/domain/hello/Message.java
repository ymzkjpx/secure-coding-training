package com.securecodingtraining.domain.hello;

public class Message {
    String value;

    public Message(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }


    @Override
    public String toString() {
        return value;
    }
}
