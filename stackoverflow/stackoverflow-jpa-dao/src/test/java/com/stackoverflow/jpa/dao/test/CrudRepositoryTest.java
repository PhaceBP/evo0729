package com.stackoverflow.jpa.dao.test;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.stackoverflow.domain.model.Answer;
import com.stackoverflow.domain.model.Question;
import com.stackoverflow.domain.model.User;
import com.stackoverflow.jpa.dao.DaoConfig;
import com.stackoverflow.jpa.dao.JpaQuestionRepository;
import com.stackoverflow.jpa.dao.JpaUserRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
@ContextConfiguration(classes = {DaoConfig.class})
@Ignore
public class CrudRepositoryTest {
	
	@Autowired
	private JpaUserRepository userRepo;
	
	@Autowired
	private JpaQuestionRepository questionRepo;
	
	@Test
	public void testCreateQuestionWith1AnswerWithoutReply() {
		
		
		LocalDateTime creationTime = LocalDateTime.of(2018, 8, 1, 20, 0);
		User bob = new User(1L, "Bob", creationTime);
		userRepo.save(bob);
		
		User james = new User(1L, "Bob", creationTime);
		userRepo.save(james);
		
		creationTime = LocalDateTime.of(2019, 8, 1, 20, 0);
		Question question = new Question(2L, "How to use Jdbc?", creationTime, bob);
		creationTime = LocalDateTime.of(2019, 8, 1, 22, 10);
		question.addAnswer(new Answer(3L, creationTime, james, "Its really simple!"));
		questionRepo.save(question);

		Assert.assertEquals(1, question.getAnswers().size());
		Assert.assertEquals("How to use Jdbc?", question.getTitle());
		Assert.assertEquals(LocalDateTime.of(2019, 8, 1, 20, 0), question.getCreationTime());
		Assert.assertEquals(bob, question.getAuthor());
	}

}
