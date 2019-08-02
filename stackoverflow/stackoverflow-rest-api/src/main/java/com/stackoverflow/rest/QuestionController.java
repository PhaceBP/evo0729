package com.stackoverflow.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackoverflow.domain.model.Question;
import com.stackoverflow.jpa.dao.JpaQuestionRepository;

@RestController
@RequestMapping(path = { "/api" })
public class QuestionController {

	@Autowired
	private JpaQuestionRepository questionRepository;

	@GetMapping(path = { "/questions/{id}" }, produces = "application/json")
	public Question getQuestionsById(@PathVariable Long id) {
		return questionRepository.findById(id).orElseThrow();
	}

	@GetMapping(path = { "/questions" }, produces = "application/json")
	public List<Question> allQuestions() {
		return questionRepository.findAll();
	}
}
