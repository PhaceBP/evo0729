package com.stackoverflow.domain.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@MappedSuperclass
public abstract class BusinessObject<ID> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -57599328642890970L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private ID id;

	@Column
	private LocalDateTime creationTime;

	
	private Boolean isActive;

	public BusinessObject(ID id, LocalDateTime creationTime, Boolean isActive) {
		super();
		this.id = id;
		this.creationTime = creationTime;
		this.isActive = isActive;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ID getId() {
		return id;
	}

	public LocalDateTime getCreationTime() {
		return creationTime;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creationTime == null) ? 0 : creationTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusinessObject<ID> other = (BusinessObject) obj;
		if (creationTime == null) {
			if (other.creationTime != null)
				return false;
		} else if (!creationTime.equals(other.creationTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isActive == null) {
			if (other.isActive != null)
				return false;
		} else if (!isActive.equals(other.isActive))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BusinessObject [id=" + id + ", creationTime=" + creationTime + ", isActive=" + isActive + "]";
	}

}
