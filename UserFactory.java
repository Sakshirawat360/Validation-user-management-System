package com.example.usermanagement.repo;

import com.example.usermanagement.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class UserFactory {
    @Bean
   List<User> getUserListInit(){
       return new ArrayList<>();
   }
}
