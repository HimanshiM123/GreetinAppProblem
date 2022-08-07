package com.bridgelabz.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingservice{
    @Override
    public String getMessage() {
        return "Hello World";
    }
}
