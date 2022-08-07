package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingservice {

    @Override
    public String getMessage() {
        return "Hello World";
    }
    @Override
    public String getGreeting(Greeting greeting) {
        return greeting.toString();
    }
}
