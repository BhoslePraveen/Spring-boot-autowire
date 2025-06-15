package com.velocity.demo.beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // Default
public class SingletonBean {
    public SingletonBean(){
        System.out.println("Singleton Bean is Created ...");
    }
}
