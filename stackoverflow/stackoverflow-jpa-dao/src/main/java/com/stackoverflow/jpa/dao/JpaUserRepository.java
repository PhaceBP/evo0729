package com.stackoverflow.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.stackoverflow.domain.model.User;

@Component
public interface JpaUserRepository extends JpaRepository<User, Long> {

}
