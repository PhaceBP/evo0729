package com.stackoverflow.domain.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Answer extends BusinessObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3962003281637571817L;

	private String content;

	private Long usefulMarkCounter = Long.valueOf(0L);

	@OneToOne
	private User author;

	@ManyToOne
	private Answer parent;

	@OneToMany(mappedBy="parent")
	private List<Answer> replies = new ArrayList<Answer>();

	public Answer() {
		
	}
	
	public Answer(LocalDateTime creationTime, User author, String content) {
		super(creationTime, true);
		this.content = content;
		this.author = author;
	}
	
	public Answer(Long id, LocalDateTime creationTime, User author, String content) {
		super(id, creationTime, true);
		this.content = content;
		this.author = author;
	}

	public Answer getParent() {
		return parent;
	}

	public void setParent(Answer parent) {
		this.parent = parent;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getUsefulMarkCounter() {
		return Long.valueOf(usefulMarkCounter);
	}

	public void markAnswerAsUseful() {
		this.usefulMarkCounter += 1;
	}

	public List<Answer> getReplies() {
		return Collections.unmodifiableList(replies);
	}

	public void addReply(Answer answer) {
		this.replies.add(answer);
	}

	public User getAuthor() {
		return author;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
		result = prime * result + ((replies == null) ? 0 : replies.hashCode());
		result = prime * result + ((usefulMarkCounter == null) ? 0 : usefulMarkCounter.hashCode());
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
		Answer other = (Answer) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (parent == null) {
			if (other.parent != null)
				return false;
		} else if (!parent.equals(other.parent))
			return false;
		if (replies == null) {
			if (other.replies != null)
				return false;
		} else if (!replies.equals(other.replies))
			return false;
		if (usefulMarkCounter == null) {
			if (other.usefulMarkCounter != null)
				return false;
		} else if (!usefulMarkCounter.equals(other.usefulMarkCounter))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Answer [content=" + content + ", usefulMarkCounter=" + usefulMarkCounter + ", author=" + author+"]";
	}

}
