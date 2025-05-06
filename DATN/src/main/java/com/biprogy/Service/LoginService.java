package com.biprogy.Service;

import com.biprogy.Repository.LoginRepository;

public class LoginService {

    private final LoginRepository loginRepository = new LoginRepository();
    public String LoginProcess(String username, String password) {
        if (loginRepository.checkLogin(username,password)) {
            return "success";
        }else
        {
            return "fail";
        }
    }
}
