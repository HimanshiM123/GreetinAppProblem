package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService implements IGreetingService {
    @Autowired
    IGreetingRepository repository;
    @Override
    public String getMessage() {

        return "Hello World";
    }
    @Override
    public String getGreeting(Greeting greeting) {
        repository.save(greeting);
        return greeting.toString();
    }
    @Override
    public Greeting greetingMessage(long getId){
        Optional<Greeting> greeting = repository.findById(getId);
        return greeting.get();

    }
    @Override
    public List<Greeting> getGreetings() {
        List<Greeting> greetings = repository.findAll();
        return greetings;
    }
}
