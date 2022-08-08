package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.User;
import com.bridgelabz.greetingapp.repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
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
    public Greeting greetingMessage(long getId) {
        return null;
    }

    @Override
    public List<Greeting> getGreetings() {
        List<Greeting> greetings = repository.findAll();
        return greetings;
    }

    @Override
    public Greeting addGreeting(User user) {
       String message = String.format(template, (user.toString().isEmpty())? "Hello World" : user.toString());
       return repository.save(new Greeting(counter.incrementAndGet(), message));
    }
}
