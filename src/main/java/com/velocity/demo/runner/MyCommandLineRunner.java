package com.velocity.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    // String... args : varargs (Variable arguments) its just like this --> String[]
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application started via command line Runner");
        for (String arg : args) {
            System.out.println("Args -->  " + arg);
        }
    }
}
