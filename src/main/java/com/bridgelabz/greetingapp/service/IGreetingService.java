package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.User;

import java.util.List;

public interface IGreetingService {
    public String getMessage();
    public String getGreeting(Greeting greeting);
    Greeting greetingMessage(long getId);

    List<Greeting> getGreetings();

    Greeting addGreeting(User user);
}
