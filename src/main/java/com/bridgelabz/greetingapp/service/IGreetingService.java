package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;

public interface IGreetingService {
    public String getMessage();
    public String getGreeting(Greeting greeting);
    Greeting greetingMessage(long getId);
}
