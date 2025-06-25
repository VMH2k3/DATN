package com.biprogy.Repository;

import com.biprogy.Model.Product;
import com.biprogy.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUserName(String userName);
    @Query("select u from User u where u.userName like %?1%")
    List<User> searchUser(String keyWord);
}
