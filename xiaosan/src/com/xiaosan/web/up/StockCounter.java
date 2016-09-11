package com.xiaosan.web.up;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Administrator
 *
 */
public class StockCounter {

	// 默认涨幅10个点
	private final static BigDecimal DEFAULT_PERCENT_RANGE = new BigDecimal("0.10");

	// 最大允许50个涨停计算
	private final static int MAX_COUNT = 50;

	public Map<AccountIncomeResult, List<LimitUpPriceResult>> compute(SharesHoldingInfo sharesHoldingInfo,
			String stockCurrentUnitPrice) {

		Map<AccountIncomeResult, List<LimitUpPriceResult>> map = new HashMap<AccountIncomeResult, List<LimitUpPriceResult>>();

		List<LimitUpPriceResult> list = new ArrayList<LimitUpPriceResult>();

		AccountIncomeResult accountIncomeResult = new AccountIncomeResult();
		// ---------------当前持有股票盈利情况计算
		BigDecimal unitPrice = new BigDecimal(sharesHoldingInfo.getFirstCostPrice());
		BigDecimal count = new BigDecimal(sharesHoldingInfo.getStockCount());
		BigDecimal firstCostTotalAmount = unitPrice.multiply(count);
		BigDecimal currentTotalAmount = new BigDecimal(stockCurrentUnitPrice).multiply(count);
		BigDecimal gainTotalAmount = currentTotalAmount.subtract(firstCostTotalAmount);
		if (gainTotalAmount.compareTo(firstCostTotalAmount) == 1) {
			accountIncomeResult.setStatus(AccountIncomeStatus.GAIN.getStatus());
		}
		if (gainTotalAmount.compareTo(firstCostTotalAmount) == 0) {
			accountIncomeResult.setStatus(AccountIncomeStatus.BREAKEVEN.getStatus());
		}
		if (gainTotalAmount.compareTo(firstCostTotalAmount) == -1) {
			accountIncomeResult.setStatus(AccountIncomeStatus.LOSS.getStatus());
		}
		accountIncomeResult.setGainAmount(gainTotalAmount.toPlainString());

		// ------------计算结束，开始涨停计算

		int times = (sharesHoldingInfo.getLimitUpTimes() > MAX_COUNT) ? MAX_COUNT : sharesHoldingInfo.getLimitUpTimes();

		LimitUpPriceResult rst = null;
		for (int i = 0; i < times; i++) {

			rst = new LimitUpPriceResult();
			BigDecimal UnitPrice = new BigDecimal(stockCurrentUnitPrice);
			// 涨停股价
			BigDecimal limitUpPrice = UnitPrice.add(UnitPrice.multiply(DEFAULT_PERCENT_RANGE));
			// 账户总金额
			BigDecimal accountTotalAmount = count.multiply(limitUpPrice);
			// 收益比例
			BigDecimal garinPercent = accountTotalAmount.subtract(firstCostTotalAmount).divide(firstCostTotalAmount);

			rst.setGainsPercentage(garinPercent.toPlainString() + "%");
			rst.setLimitUpPrice(limitUpPrice.toPlainString());
			rst.setTimes(i + 1);
			rst.setTotalAmount(accountTotalAmount.toPlainString());
			list.add(rst);
			stockCurrentUnitPrice = limitUpPrice.toPlainString();
		}

		map.put(accountIncomeResult, list);

		return map;
	}

}
