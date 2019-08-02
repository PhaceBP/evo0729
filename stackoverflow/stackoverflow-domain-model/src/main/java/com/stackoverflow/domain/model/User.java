package com.stackoverflow.domain.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;

@Entity
public class User extends BusinessObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7806332828952494281L;

	private String userName;

	private Long reputationScore = Long.valueOf(0);

	private Long numberOfGoldBadges = Long.valueOf(0);

	private Long numberOfSilverBadges = Long.valueOf(0);

	private Long numberOfBronzeBadges = Long.valueOf(0);

	public User() {

	}

	public User(String userName, LocalDateTime creationTime) {
		super(creationTime, true);
		this.userName = userName;
	}

	public User(Long id, String userName, LocalDateTime creationTime) {
		super(id, creationTime, true);
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public Long getReputationScore() {
		return Long.valueOf(reputationScore);
	}

	public Long getNumberOfGoldBadges() {
		return Long.valueOf(numberOfGoldBadges);
	}

	public Long getNumberOfSilverBadges() {
		return Long.valueOf(numberOfSilverBadges);
	}

	public Long getNumberOfBronzeBadges() {
		return Long.valueOf(numberOfBronzeBadges);
	}

	public void increaseGoldBadges() {
		this.numberOfGoldBadges += 1;
	}

	public void increaseSilverBadges() {
		this.numberOfSilverBadges += 1;
	}

	public void increaseBronzeBadges() {
		this.numberOfBronzeBadges += 1;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setReputationScore(Long reputationScore) {
		this.reputationScore = reputationScore;
	}

	public void setNumberOfGoldBadges(Long numberOfGoldBadges) {
		this.numberOfGoldBadges = numberOfGoldBadges;
	}

	public void setNumberOfSilverBadges(Long numberOfSilverBadges) {
		this.numberOfSilverBadges = numberOfSilverBadges;
	}

	public void setNumberOfBronzeBadges(Long numberOfBronzeBadges) {
		this.numberOfBronzeBadges = numberOfBronzeBadges;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((numberOfBronzeBadges == null) ? 0 : numberOfBronzeBadges.hashCode());
		result = prime * result + ((numberOfGoldBadges == null) ? 0 : numberOfGoldBadges.hashCode());
		result = prime * result + ((numberOfSilverBadges == null) ? 0 : numberOfSilverBadges.hashCode());
		result = prime * result + ((reputationScore == null) ? 0 : reputationScore.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		User other = (User) obj;
		if (numberOfBronzeBadges == null) {
			if (other.numberOfBronzeBadges != null)
				return false;
		} else if (!numberOfBronzeBadges.equals(other.numberOfBronzeBadges))
			return false;
		if (numberOfGoldBadges == null) {
			if (other.numberOfGoldBadges != null)
				return false;
		} else if (!numberOfGoldBadges.equals(other.numberOfGoldBadges))
			return false;
		if (numberOfSilverBadges == null) {
			if (other.numberOfSilverBadges != null)
				return false;
		} else if (!numberOfSilverBadges.equals(other.numberOfSilverBadges))
			return false;
		if (reputationScore == null) {
			if (other.reputationScore != null)
				return false;
		} else if (!reputationScore.equals(other.reputationScore))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", reputationScore=" + reputationScore + ", numberOfGoldBadges="
				+ numberOfGoldBadges + ", numberOfSilverBadges=" + numberOfSilverBadges + ", numberOfBronzeBadges="
				+ numberOfBronzeBadges + "]";
	}

}
