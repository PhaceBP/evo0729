package com.stackoverflow.domain.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question extends BusinessObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1129018659999964254L;

	private String title;

	@ManyToOne
	private User author;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Answer> answers = new ArrayList<>();

	public Question(Long id, String title, LocalDateTime creationTime, User author) {
		super(id, creationTime, true);
		this.title = title;
		this.author = author;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public User getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public List<Answer> getAnswers() {
		return Collections.unmodifiableList(answers);
	}

	public void addAnswer(Answer answer) {
		this.answers.add(answer);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((answers == null) ? 0 : answers.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (answers == null) {
			if (other.answers != null)
				return false;
		} else if (!answers.equals(other.answers))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Question [title=" + title + ", author=" + author + "]";
	}

}
