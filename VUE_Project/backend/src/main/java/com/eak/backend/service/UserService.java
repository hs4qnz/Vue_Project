package com.eak.backend.service;

import com.eak.backend.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public User addUser(User user);
    public User getUserById(long id);
    public List<User> getUsers();
    public void deleteUser(long id);
    public User updateUser(User user);
}
