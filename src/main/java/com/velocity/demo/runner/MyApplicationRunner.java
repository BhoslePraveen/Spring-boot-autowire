package com.velocity.demo.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Application started via Application Runner");
        if(args.containsOption("user")){
            System.out.println("Values for Option :: "+args.getOptionValues("user"));
        }
        System.out.println("These are Non option values "+args.getNonOptionArgs());
    }
}
