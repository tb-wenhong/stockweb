package com.xiaosan.web.up;

import java.util.Date;

/**
 * 持股信息
 * @author Administrator
 *
 */
public class SharesHoldingInfo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//股票代码
	private String stockCode;
	
	//成本单价
	private String firstCostPrice;

	//持有数量
	private int    stockCount;
	
	//涨停个数
	private int    limitUpTimes;
	
	//第一次买入时间
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
