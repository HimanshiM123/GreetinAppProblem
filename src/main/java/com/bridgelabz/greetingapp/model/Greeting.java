package com.bridgelabz.greetingapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Greeting {
   @Id
   @GeneratedValue
    private Long id;
    private String message;

    public Greeting(Long id, String message) {
        this.id = id;
        this.message = message;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Id
    public Long getId() {
        return id;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Greeting() {
    }
}
