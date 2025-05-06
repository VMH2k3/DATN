package com.biprogy.Service;

import com.biprogy.Model.User;
import com.biprogy.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
