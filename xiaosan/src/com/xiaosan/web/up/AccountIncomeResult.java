package com.xiaosan.web.up;

/**
 * 
 * @author Administrator
 *
 */
public class AccountIncomeResult {
	
	//0,持平 1，亏损 2 浮盈
	private int status=0;
	
	//盈利金额
	private String gainAmount;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getGainAmount() {
		return gainAmount;
	}

	public void setGainAmount(String gainAmount) {
		this.gainAmount = gainAmount;
	}

	@Override
	public String toString() {
		return "AccountIncomeResult [status=" + status + ", gainAmount=" + gainAmount + "]";
	}
	
	
	

}
