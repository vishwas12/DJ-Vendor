package com.dj.vendor.dto;

public class ResultData {
	private Long id;
	private boolean isSuccess;
	private Object data;
	private String message;
	
	public ResultData(boolean isSuccess, String message) {
		super();
		this.isSuccess = isSuccess;
		this.message = message;
	}
	
	public ResultData(boolean isSuccess, String message, Object data) {
		super();
		this.isSuccess = isSuccess;
		this.message = message;
		this.data = data;
	}
	
	public ResultData() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "ResultData [id=" + id + ", isSuccess=" + isSuccess + ", data=" + data + ", message=" + message + "]";
	}
}
