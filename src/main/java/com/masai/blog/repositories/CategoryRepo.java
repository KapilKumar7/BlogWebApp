package com.masai.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
