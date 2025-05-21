package com.biprogy.Service;

import com.biprogy.Model.Role;

public interface RoleService {
    Role getRole(int id);
    Boolean addRole(Role role);
}
