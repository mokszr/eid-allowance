package com.smartycoder.ramadan.model;
/**
 * 
 * @see https://www.smartycoder.com/
 *
 */
public class Grandpa implements IGrandpa {

	private Integer totalAllowanceToBeDistributed;

	@Override
	public boolean giveAllowance(Integer allowanceToBeTaken) {
	 
		totalAllowanceToBeDistributed = totalAllowanceToBeDistributed - allowanceToBeTaken;
		
		return totalAllowanceToBeDistributed >= 0;
	}
	
	@Override
	public Integer geRemainingAllowance() {
		
		return totalAllowanceToBeDistributed;
	}
	
	@Override
	public void setTotalAllowanceToBeDistributed(Integer totalAllowanceToBeDistributed) {
		this.totalAllowanceToBeDistributed = totalAllowanceToBeDistributed;
	}
}
