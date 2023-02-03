package com.example.elya.service;

import com.example.elya.model.User;

import java.util.List;

public interface UserService {
    public User addUser(User u);
    public List<User>getAllUser();
    public User getUser(Long id);
    public User edit(User u);
    public void deleteUser(Long id);
}
