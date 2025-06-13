package com.velocity.demo.setter;

import org.springframework.stereotype.Component;

@Component("xyz")
public class UserDao implements IuserDao {

    @Override
    public String findNameById(Integer id) {
        return "Mohan";
    }
}
