package com.masai.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
