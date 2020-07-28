package com.example.demotest3.repository;

import com.example.demotest3.entity.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <AppUser, Integer> {
   // AppUser findAppUserBy(String userName);
}
