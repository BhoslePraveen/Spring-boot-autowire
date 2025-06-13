package com.velocity.demo.constructor;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReport implements IReport{

    @Override
    public String report() {
        return "Excel Report generated...";
    }
}
