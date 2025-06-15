package com.velocity.demo.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component : Not using this as iam creating my own bean here
public class MyBean implements InitializingBean, DisposableBean {

    public MyBean() {
        System.out.println("1️⃣ Bean constructor is called...");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("2️⃣ @PostConstrct is called ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("3️⃣ afterPropertiesSet method is called ...");
    }

    public void customInit(){
        System.out.println("4️⃣ Custom Init method is called ...");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("5️⃣ @PreDestroy Is called ...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("6️⃣ destroy method is called ...");
    }

    public void customDestroy(){
        System.out.println("7️⃣ custom destroy method is called ...");
    }
}
