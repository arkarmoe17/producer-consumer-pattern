package com.mytel.producerconsumerpattern.entity;

public class Message {
    private String phone;
    private String message;

    public Message() {
    }

    public Message(String phone, String message) {
        this.phone = phone;
        this.message = message;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "phone='" + phone + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
