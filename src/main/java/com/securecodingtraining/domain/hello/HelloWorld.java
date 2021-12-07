package com.securecodingtraining.domain.hello;

public class HelloWorld {
    Message message;

    public HelloWorld(Message value) {
        this.message = value;
    }

    public Message value() {
        return message;
    }

    public static String say(){
        return new HelloWorld(new Message("Hello World")).message.value;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "message=" + message +
                '}';
    }
}
