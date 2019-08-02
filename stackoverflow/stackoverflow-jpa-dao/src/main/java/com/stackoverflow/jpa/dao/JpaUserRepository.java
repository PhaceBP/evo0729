package com.stackoverflow.jpa.dao;

import org.springframework.stereotype.Repository;

import com.stackoverflow.domain.model.User;

@Repository
public class JpaUserRepository extends JpaCrudRepository<User, Long> {

}
