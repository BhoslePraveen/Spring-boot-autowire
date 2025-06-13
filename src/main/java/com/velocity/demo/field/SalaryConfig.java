package com.velocity.demo.field;

import org.springframework.stereotype.Component;

@Component("salary")
public class SalaryConfig implements IConfig{
    @Override
    public void changeDate() {
        System.out.println("Data is changed from salary Module");
    }
}
