package com.velocity.demo.field;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("job")
@Primary
public class JobConfig implements IConfig{

    @Override
    public void changeDate() {
        System.out.println("Job detailed changed..");
    }
}
