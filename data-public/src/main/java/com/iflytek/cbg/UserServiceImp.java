package com.iflytek.cbg;

import org.springframework.stereotype.Service;

/**
 * Created by yoqu on 2018/3/12.
 */
@Service
public class UserServiceImp implements UserService {

    public UserServiceImp() {
        System.out.println("init public UserServiceImp");
    }

    public boolean login(String username, String password) {
        System.out.println("this is 【 public 】 user login method");
        return false;
    }
}
