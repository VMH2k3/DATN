package com.biprogy.Service;

import com.biprogy.Model.CustomUserDetails;
import com.biprogy.Model.User;
import com.biprogy.Model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("Tài khoản không tồn tại" );
        }
        Collection<GrantedAuthority> grantedAuthorities = new HashSet<>();
        Set<UserRole> roles = user.getUserRoles();
        for (UserRole userRole : roles) {
            grantedAuthorities.add(new SimpleGrantedAuthority(userRole.getRole().getName()));
        }
        return new CustomUserDetails(user, grantedAuthorities);
    }
}
