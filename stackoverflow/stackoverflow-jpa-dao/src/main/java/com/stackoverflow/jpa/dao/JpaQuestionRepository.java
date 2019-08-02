package com.stackoverflow.jpa.dao;

import org.springframework.stereotype.Repository;

import com.stackoverflow.domain.model.Question;

@Repository
public class JpaQuestionRepository extends JpaCrudRepository<Question, Long> {

}
