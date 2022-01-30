package com.example.demo.service;

import java.util.List;

import com.example.demo.data.User;

public interface UserService {
    User create( User user );

    User findById( String id );

    List<User> getAll();

    void deleteById( String id ) throws Exception;

    User update(User user, String userId );
}
