package com.alen.site.modules.user.service;

import com.alen.site.modules.user.entiy.TUsersEntity;
import com.alen.site.modules.user.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserJPA userJPA;


    public TUsersEntity findByUserName(String username) {
        return  userJPA.findByUsername(username);
    }
}
