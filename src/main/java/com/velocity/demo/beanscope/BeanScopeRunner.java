package com.velocity.demo.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanScopeRunner implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Singleton Bean -1 "+context.getBean(SingletonBean.class));
        System.out.println("Singleton Bean -2 "+context.getBean(SingletonBean.class));
        System.out.println("=========================================================");
        System.out.println("Prototype Bean -1 "+context.getBean(PrototypeBean.class));
        System.out.println("Prototype Bean -2 "+context.getBean(PrototypeBean.class));
    }
}
