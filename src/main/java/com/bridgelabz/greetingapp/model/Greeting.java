package com.bridgelabz.greetingapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Greeting {
   @Id
   @GeneratedValue
    private long id;
    private String message;

    public Greeting(long id, String message) {
        this.id = id;
        this.message = message;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Id
    public long getId() {

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
    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
