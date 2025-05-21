package com.biprogy.Service;

import com.biprogy.Model.Role;
import com.biprogy.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Role getRole(int id) {
        return this.roleRepository.findById(id).get();
    }

    @Override
    public Boolean addRole(Role role) {
        try {
            this.roleRepository.save(role);
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
