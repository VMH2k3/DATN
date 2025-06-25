package com.biprogy.Service;

import com.biprogy.Model.Product;
import com.biprogy.Model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User findByUserName(String userName);
    Boolean create(User user);
    User findById(Long id);
    Boolean update(User user);
    Page<User> searchUser(String keyword, Integer pageNo);
    Page getAll(Integer pageNo);
    List<User> searchUser(String keyword);
}
