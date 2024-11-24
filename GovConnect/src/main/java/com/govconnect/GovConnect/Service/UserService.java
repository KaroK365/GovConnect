package com.govconnect.GovConnect.Service;

import com.govconnect.GovConnect.Entity.User;
import com.govconnect.GovConnect.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public Optional<User> getUser(String username) {
        return userRepository.findByUsername(username);
    }

    public void DeleteUser(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        user.ifPresent(value -> userRepository.delete(value));
    }
}
