package com.alemeno.springbootproj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alemeno.springbootproj.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
