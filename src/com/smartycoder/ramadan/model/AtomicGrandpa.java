package com.smartycoder.ramadan.model;

import java.util.concurrent.atomic.AtomicInteger;
/**
 * 
 * @see https://www.smartycoder.com/
 *
 */
public class AtomicGrandpa implements IGrandpa {

	private AtomicInteger totalAllowanceToBeDistributed;

	@Override
	public boolean giveAllowance(Integer allowanceToBeTaken) {
		 
		totalAllowanceToBeDistributed.addAndGet(-allowanceToBeTaken);
		
		return totalAllowanceToBeDistributed.get() >= 0;
	}
	
	@Override
	public Integer geRemainingAllowance() {
		
		return totalAllowanceToBeDistributed.get();
	}
	
	@Override
	public void setTotalAllowanceToBeDistributed(Integer totalAllowanceToBeDistributed) {
		this.totalAllowanceToBeDistributed = new AtomicInteger(totalAllowanceToBeDistributed);
	}

}
