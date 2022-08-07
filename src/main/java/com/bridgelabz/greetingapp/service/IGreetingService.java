package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;

import java.util.List;

public interface IGreetingService {
    public String getMessage();
    public String getGreeting(Greeting greeting);
    Greeting greetingMessage(long getId);

    List<Greeting> getGreetings();
}
