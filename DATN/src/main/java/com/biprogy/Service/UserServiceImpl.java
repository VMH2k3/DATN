package com.biprogy.Service;

import com.biprogy.Model.User;
import com.biprogy.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    @Transactional
    public Boolean create(User user) {
        try {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            this.userRepository.save(user);
            return true;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
