package com.mrjason.service;


import com.mrjason.pojo.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UsersService {
    List<Users> findUsersAll();
    Users findUserById(Integer id);
    Page<Users>  findUserByPage(Pageable pageable);
    void saveUsers(Users users);
}
