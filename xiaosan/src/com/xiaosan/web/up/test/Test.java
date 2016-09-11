package com.xiaosan.web.up.test;

import java.util.List;
import java.util.Map;

import com.xiaosan.web.up.AccountIncomeResult;
import com.xiaosan.web.up.LimitUpPriceResult;
import com.xiaosan.web.up.SharesHoldingInfo;
import com.xiaosan.web.up.StockCounter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StockCounter stockCounter=new StockCounter();
		
		SharesHoldingInfo sharesHoldingInfo=new SharesHoldingInfo();
		sharesHoldingInfo.setBuyTime(null);
		sharesHoldingInfo.setFirstCostPrice("10.00");
		sharesHoldingInfo.setLimitUpTimes(10);
		sharesHoldingInfo.setStockCode("600358");
		sharesHoldingInfo.setStockCount(13600);
		
		Map<AccountIncomeResult, List<LimitUpPriceResult>> rstMap=stockCounter.compute(sharesHoldingInfo, "11.03");
		
		System.out.println(rstMap.toString());
		
		
	}

}
