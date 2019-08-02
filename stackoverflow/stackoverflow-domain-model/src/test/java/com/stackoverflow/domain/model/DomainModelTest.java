package com.stackoverflow.domain.model;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

public class DomainModelTest {

	@Test
	public void testCreateQuestionWith1AnswerWithoutReply() {

		LocalDateTime creationTime = LocalDateTime.of(2018, 8, 1, 20, 0);
		User bob = new User(1L, "Bob", creationTime);
		creationTime = LocalDateTime.of(2019, 8, 1, 20, 0);
		Question question = new Question(2L, "How to use Jdbc?", creationTime, bob);
		creationTime = LocalDateTime.of(2019, 8, 1, 22, 10);
		User james = new User(1L, "Bob", creationTime);
		question.addAnswer(new Answer(3L, creationTime, james, "Its really simple!"));

		Assert.assertEquals(1, question.getAnswers().size());
		Assert.assertEquals("How to use Jdbc?", question.getTitle());
		Assert.assertEquals(LocalDateTime.of(2019, 8, 1, 20, 0), question.getCreationTime());
		Assert.assertEquals(bob, question.getAuthor());
	}
}
