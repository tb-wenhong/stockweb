package com.xiaosan.web.up;

public enum AccountIncomeStatus {

	BREAKEVEN(0, "±£±¾"),

	GAIN(1, "Ó¯Àû"),

	LOSS(2, "¿÷Ëð");

	private int status;

	private String desc;

	private AccountIncomeStatus(int status, String desc) {
		this.status = status;
		this.desc = desc;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
