package com.stackoverflow.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.stackoverflow.domain.model.Answer;
import com.stackoverflow.domain.model.Question;
import com.stackoverflow.domain.model.User;
import com.stackoverflow.jpa.dao.JpaAnswerRepository;
import com.stackoverflow.jpa.dao.JpaQuestionRepository;
import com.stackoverflow.jpa.dao.JpaUserRepository;

@SpringBootApplication
@ComponentScan(basePackages = { "com.stackoverflow" })
public class Application implements CommandLineRunner {

	@Autowired
	private JpaUserRepository userRepo;

	@Autowired
	private JpaQuestionRepository questionRepo;

	@Autowired
	private JpaAnswerRepository answerRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		LocalDateTime creationTime = LocalDateTime.of(2018, 8, 1, 20, 0);
		User bob = new User("Bob", creationTime);
		userRepo.save(bob);

		User james = new User("Bob", creationTime);
		userRepo.save(james);

		creationTime = LocalDateTime.of(2019, 8, 1, 20, 0);
		Question question = new Question("How to use Jdbc?", creationTime, bob);
		creationTime = LocalDateTime.of(2019, 8, 1, 22, 10);
		question.addAnswer(new Answer(creationTime, james, "Its really simple!"));
		questionRepo.save(question);
		
		System.out.println("Saved QUESTION: "+question.getId());

	}
}