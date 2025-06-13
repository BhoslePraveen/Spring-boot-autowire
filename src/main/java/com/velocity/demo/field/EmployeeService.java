package com.velocity.demo.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
    @Autowired
    @Qualifier("salary")
    private IConfig config;

    public void getConfigDetails(){
        config.changeDate();
    }
}
