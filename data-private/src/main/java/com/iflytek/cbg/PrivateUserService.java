package com.iflytek.cbg;

import org.springframework.stereotype.Service;

/**
 * Created by yoqu on 2018/3/12.
 */
@Service
public class PrivateUserService implements UserService {
    public PrivateUserService(){
        System.out.println("init privateUserService");
    }
    public boolean login(String username, String password) {
        System.out.println("this is 【 private 】 user login method");
        return false;
    }
}
