package com.biprogy.Service;

import com.biprogy.Model.User;

public interface UserService {
    User findByUserName(String userName);
}
