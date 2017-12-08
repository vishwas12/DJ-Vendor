package com.dj.constants;

public enum UserStatus {
	ACTIVE(1,"Active"),
	SUSPENDED(2,"Suspende"),
	VERIFICATION_PENDING(3,"Verification Pending");
	
	private int id;
	private String description;
	
	private UserStatus(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
