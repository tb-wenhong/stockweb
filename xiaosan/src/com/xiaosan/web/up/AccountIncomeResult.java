package com.xiaosan.web.up;

/**
 * 
 * @author Administrator
 *
 */
public class AccountIncomeResult {
	
	//0,��ƽ 1������ 2 ��ӯ
	private int status=0;
	
	//ӯ�����
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
