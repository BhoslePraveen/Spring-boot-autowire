package com.velocity.demo.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    // Global Variable
    private IuserDao iuserDao;

    //Setter Based Injection
    @Autowired
    @Qualifier("xyz")
    public void setUserDao(IuserDao iuserDao) {
        System.out.println("Setter Method is called ...");
        this.iuserDao = iuserDao;
        System.out.println("Injected Bean name is : " + iuserDao.getClass().getName());
    }

    public void getName(Integer id) {
        String empName = iuserDao.findNameById(id);
        System.out.println("Name is : " + empName);
    }
}
