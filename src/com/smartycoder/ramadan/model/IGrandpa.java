package com.smartycoder.ramadan.model;
/**
 * 
 * @see https://www.smartycoder.com/
 *
 */
public interface IGrandpa {

	public boolean giveAllowance(Integer allowanceToBeTaken);
	
	public Integer geRemainingAllowance();

	void setTotalAllowanceToBeDistributed(Integer totalAllowanceToBeDistributed);
}
