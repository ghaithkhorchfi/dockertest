package com.example.elya.controller;

import com.example.elya.model.User;
import com.example.elya.repo.UserRepo;
import com.example.elya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping()
    public User addUser(@RequestBody User u){
        return userService.addUser(u);
    }
    @GetMapping()
    public List<User>getAll(){
        return userService.getAllUser();
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }
    @PutMapping("/{id}")
    public User edit(@PathVariable Long id,@RequestBody User u){
        return userService.edit(u);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.deleteUser(id);
    }
}
