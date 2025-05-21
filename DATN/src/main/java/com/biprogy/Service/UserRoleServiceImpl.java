package com.biprogy.Service;

import com.biprogy.Model.UserRole;
import com.biprogy.Repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public Boolean addUserRole(UserRole userRole) {
        try {
            this.userRoleRepository.save(userRole);
            return true;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
