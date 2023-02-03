package com.example.elya.serviceImpl;

import com.example.elya.model.User;
import com.example.elya.repo.UserRepo;
import com.example.elya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public User addUser(User u) {
        return userRepo.save(u);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(Long id) {
        Optional<User>u=userRepo.findById(id);
        return u.isPresent()?u.get():null ;
    }

    @Override
    public User edit(User u) {
        return userRepo.save(u);
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);

    }
}
