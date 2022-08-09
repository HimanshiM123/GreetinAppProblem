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
    public Greeting addGreeting(User user) {
       String message = String.format(template, (user.toString().isEmpty())? "Hello World" : user.toString());
       return repository.save(new Greeting(counter.incrementAndGet(), message));
    }
    @Override
    public String getGreeting(Greeting greeting) {
        repository.save(greeting);
        return greeting.toString();
    }
    @Override
    public Greeting greetingMessage(long getId) {
        Optional<Greeting> greeting = repository.findById(getId);
        return greeting.get();
    }
    @Override
    public List<Greeting> getGreetings() {
        List<Greeting> greetings = repository.findAll();
        return greetings;
    }
    @Override
    public Greeting updateUserMessage(long getId, Greeting greeting) {
        Optional<Greeting> newGreeting = repository.findById(getId);
        if (newGreeting.isPresent()) {
            newGreeting.get().setMessage(greeting.getMessage());
            repository.save(newGreeting.get());
            return newGreeting.get();
        } else {
            return null;
        }
    }
    @Override
    public void deleteMessage(long id){
        repository.deleteById(id);
    }
}
