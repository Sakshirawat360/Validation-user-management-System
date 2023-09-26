package com.example.usermanagement.repo;

import com.example.usermanagement.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepo {
    @Autowired
   private List<User> usrList;

    public List<User> getUsrList() {
        return usrList;
    }
}
