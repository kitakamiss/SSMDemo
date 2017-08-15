package com.dmm.base.model;

import java.io.Serializable;

public class Limit implements Serializable {
	private static final long serialVersionUID = 1L;
	private long offset;
	private long limit;

	public Limit(long offset, long limit) {
		this.offset = offset;
		this.limit = limit;
	}

	public long getOffset() {
		return this.offset;
	}

	public void setOffset(long offset) {
		this.offset = offset;
	}

	public long getLimit() {
		return this.limit;
	}

	public void setLimit(long limit) {
		this.limit = limit;
	}
}