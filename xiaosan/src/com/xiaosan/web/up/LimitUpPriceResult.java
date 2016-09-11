package com.xiaosan.web.up;

/**
 * 
 * @author Administrator
 *
 */
public class LimitUpPriceResult implements java.io.Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 967712294754012411L;

	/**涨停次数*/
	private int times;
	
	/**股票价格*/
	private String limitUpPrice;
	
	/**收益百分比*/
	private String  gainsPercentage;
	
	private String  gainsAmount;
	
	private String  totalAmount;
	
	private String  previousGainsAmount;

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public String getLimitUpPrice() {
		return limitUpPrice;
	}

	public void setLimitUpPrice(String limitUpPrice) {
		this.limitUpPrice = limitUpPrice;
	}

	public String getGainsPercentage() {
		return gainsPercentage;
	}

	public void setGainsPercentage(String gainsPercentage) {
		this.gainsPercentage = gainsPercentage;
	}

	public String getGainsAmount() {
		return gainsAmount;
	}

	public void setGainsAmount(String gainsAmount) {
		this.gainsAmount = gainsAmount;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	

	public String getPreviousGainsAmount() {
		return previousGainsAmount;
	}

	public void setPreviousGainsAmount(String previousGainsAmount) {
		this.previousGainsAmount = previousGainsAmount;
	}

	@Override
	public String toString() {
		return "LimitUpPriceResult [times=" + times + ", limitUpPrice=" + limitUpPrice + ", gainsPercentage="
				+ gainsPercentage + ", gainsAmount=" + gainsAmount + ", totalAmount=" + totalAmount
				+ ", previousGainsAmount=" + previousGainsAmount + "]";
	}

	


}
