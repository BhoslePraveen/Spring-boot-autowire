package com.velocity.demo.setter;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("abc")
@Primary
public class SuperUserDao implements IuserDao {

    @Override
    public String findNameById(Integer id) {
        return "Vikas";
    }
}
