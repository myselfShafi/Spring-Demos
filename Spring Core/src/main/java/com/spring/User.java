package com.spring;

public class User {
    private String name;
    private String domain;
    private String designation;

    public User() {
        System.out.println("User Object created!");
    }

    public User(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
