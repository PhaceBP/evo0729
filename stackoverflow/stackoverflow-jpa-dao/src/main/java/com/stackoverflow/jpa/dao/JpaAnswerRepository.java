package com.stackoverflow.jpa.dao;

import org.springframework.stereotype.Repository;

import com.stackoverflow.domain.model.Answer;
import com.stackoverflow.domain.model.Question;
import com.stackoverflow.domain.model.User;

@Repository
public class JpaAnswerRepository extends JpaCrudRepository<Answer, Long> {

}
