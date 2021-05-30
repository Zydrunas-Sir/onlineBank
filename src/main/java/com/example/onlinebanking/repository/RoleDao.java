package com.example.onlinebanking.repository;

import com.example.onlinebanking.security.Role;
import org.springframework.data.repository.CrudRepository;


public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findByName(String name);
}