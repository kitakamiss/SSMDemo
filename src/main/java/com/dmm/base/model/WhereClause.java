package com.dmm.base.model;

import java.io.Serializable;
import java.util.List;

public class WhereClause implements Serializable {
	private static final long serialVersionUID = 1L;
	private String columnName;
	private Boolean isNull;
	private Boolean isNotNull;
	private Object equalTo;
	private Object notEqualTo;
	private Object allEqualTo;
	private Object notAllEqualTo;
	private Object greaterThan;
	private Object greaterThanOrEqualTo;
	private Object lessThan;
	private Object lessThanOrEqualTo;
	private Object like;
	private Object notlike;
	private List<Object> inList;
	private List<Object> notInList;
	private String betweenOpt;
	private Object betweenValue1;
	private Object betweenValue2;

	public void setBetweenAnd(Object value1, Object value2) {
		if ((value1 != null) && (value2 != null)) {
			this.betweenOpt = "BETWEEN";
			this.betweenValue1 = value1;
			this.betweenValue2 = value2;
		}
	}

	public void setNotBetweenAnd(Object value1, Object value2) {
		if ((value1 != null) && (value2 != null)) {
			this.betweenOpt = "NOT BETWEEN";
			this.betweenValue1 = value1;
			this.betweenValue2 = value2;
		}
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public Boolean getIsNull() {
		return this.isNull;
	}

	public void setIsNull(Boolean isNull) {
		this.isNull = isNull;
	}

	public Boolean getIsNotNull() {
		return this.isNotNull;
	}

	public void setIsNotNull(Boolean isNotNull) {
		this.isNotNull = isNotNull;
	}

	public Object getEqualTo() {
		return this.equalTo;
	}

	public void setEqualTo(Object equalTo) {
		this.equalTo = equalTo;
	}

	public Object getNotEqualTo() {
		return this.notEqualTo;
	}

	public void setNotEqualTo(Object notEqualTo) {
		this.notEqualTo = notEqualTo;
	}

	public Object getAllEqualTo() {
		return this.allEqualTo;
	}

	public void setAllEqualTo(Object allEqualTo) {
		this.allEqualTo = allEqualTo;
	}

	public Object getNotAllEqualTo() {
		return this.notAllEqualTo;
	}

	public void setNotAllEqualTo(Object notAllEqualTo) {
		this.notAllEqualTo = notAllEqualTo;
	}

	public Object getGreaterThan() {
		return this.greaterThan;
	}

	public void setGreaterThan(Object greaterThan) {
		this.greaterThan = greaterThan;
	}

	public Object getGreaterThanOrEqualTo() {
		return this.greaterThanOrEqualTo;
	}

	public void setGreaterThanOrEqualTo(Object greaterThanOrEqualTo) {
		this.greaterThanOrEqualTo = greaterThanOrEqualTo;
	}

	public Object getLessThan() {
		return this.lessThan;
	}

	public void setLessThan(Object lessThan) {
		this.lessThan = lessThan;
	}

	public Object getLessThanOrEqualTo() {
		return this.lessThanOrEqualTo;
	}

	public void setLessThanOrEqualTo(Object lessThanOrEqualTo) {
		this.lessThanOrEqualTo = lessThanOrEqualTo;
	}

	public Object getLike() {
		return this.like;
	}

	public void setLike(Object like) {
		this.like = like;
	}

	public Object getNotlike() {
		return this.notlike;
	}

	public void setNotlike(Object notlike) {
		this.notlike = notlike;
	}

	public List<Object> getInList() {
		return this.inList;
	}

	public void setInList(List<Object> inList) {
		this.inList = inList;
	}

	public List<Object> getNotInList() {
		return this.notInList;
	}

	public void setNotInList(List<Object> notInList) {
		this.notInList = notInList;
	}

	public String getBetweenOpt() {
		return this.betweenOpt;
	}

	public Object getBetweenValue1() {
		return this.betweenValue1;
	}

	public Object getBetweenValue2() {
		return this.betweenValue2;
	}
}