package com.biprogy.Service;

import com.biprogy.Model.Product;
import com.biprogy.Model.User;
import com.biprogy.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

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

    @Override
    public User findById(Long id) {
        return this.userRepository.findById(id).get();
    }

    @Override
    public Boolean update(User user) {
        try {
            this.userRepository.save(user);
            return true;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public Page<User> searchUser(String keyword, Integer pageNo) {
        List<User> list = this.searchUser(keyword);
        Pageable pageable = PageRequest.of(pageNo-1, 5);
        int start = (int) pageable.getOffset();
        int end = (int) ((pageable.getOffset()+ pageable.getPageSize()) > list.size() ? list.size() : pageable.getPageSize()+pageable.getOffset());
        list = list.subList(start, end);
        return new PageImpl<User>(list, pageable, this.searchUser(keyword).size());
    }

    @Override
    public Page getAll(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo-1, 5);
        return this.userRepository.findAll(pageable);
    }

    @Override
    public List<User> searchUser(String keyword) {
        return this.userRepository.searchUser(keyword);
    }

}
