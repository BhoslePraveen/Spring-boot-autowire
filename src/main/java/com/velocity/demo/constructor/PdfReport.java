package com.velocity.demo.constructor;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pdf")
@Primary
public class PdfReport implements IReport{
    @Override
    public String report() {
        return "PDF Report Generated...";
    }
}
