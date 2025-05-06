package com.biprogy.Repository;

import com.biprogy.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUserName(String userName);
}
