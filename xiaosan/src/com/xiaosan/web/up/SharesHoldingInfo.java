package com.xiaosan.web.up;

import java.util.Date;

/**
 * �ֹ���Ϣ
 * @author Administrator
 *
 */
public class SharesHoldingInfo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//��Ʊ����
	private String stockCode;
	
	//�ɱ�����
	private String firstCostPrice;

	//��������
	private int    stockCount;
	
	//��ͣ����
	private int    limitUpTimes;
	
	//��һ������ʱ��
	private Date   buyTime;

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getFirstCostPrice() {
		return firstCostPrice;
	}

	public void setFirstCostPrice(String firstCostPrice) {
		this.firstCostPrice = firstCostPrice;
	}

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}

	public int getLimitUpTimes() {
		return limitUpTimes;
	}

	public void setLimitUpTimes(int limitUpTimes) {
		this.limitUpTimes = limitUpTimes;
	}

	public Date getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	
	
	
	
}
