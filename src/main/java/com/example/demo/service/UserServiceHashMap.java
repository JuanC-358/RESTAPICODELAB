package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.demo.data.User;

@Service
public class UserServiceHashMap implements UserService{
    HashMap<String , User> users = new HashMap<>();
    @Override
    public User create(User user) {
        users.put(user.getId() , user);
        return user;
    }

    @Override
    public User findById(String id) {
        return users.containsKey(id)? users.get(id) : null ;
    }

    @Override
    public List<User> getAll() {
        List<User> list = new ArrayList<User>(users.values());
        return list;
    }

    @Override
    public void deleteById(String id) throws Exception {
        if (users.containsKey(id))  users.remove(id) ;
        else throw new Exception("the Id User doesn't exist");
    }

    @Override
    public User update(User user, String userId) {
        if(users.containsKey(userId)) users.put(userId,user);
        return user;
    }
}