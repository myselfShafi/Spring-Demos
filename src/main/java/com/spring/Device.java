package com.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Device {
    private User user;

    public Device() {
        System.out.println("Device Object created!");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}