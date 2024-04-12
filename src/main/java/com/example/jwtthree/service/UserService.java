package com.example.jwtthree.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.jwtthree.model.User;


@Service
public class UserService {
    List<User> store=new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"SURAJ","SURAJ@GMAIL.COM"));
        store.add(new User(UUID.randomUUID().toString(),"ANUJ","ANUJ@GMAIL.COM"));
        store.add(new User(UUID.randomUUID().toString(),"SID","SID@GMAIL.COM"));
    }

    public List<User> getallUsers(){
        return this.store;
    }
}
