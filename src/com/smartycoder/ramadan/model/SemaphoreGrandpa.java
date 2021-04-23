package com.smartycoder.ramadan.model;

import java.util.concurrent.Semaphore;
/**
 * 
 * @see https://www.smartycoder.com/
 *
 */
public class SemaphoreGrandpa implements IGrandpa {

	private Integer totalAllowanceToBeDistributed;
	
	private Semaphore mutex = new Semaphore(1);

	@Override
	public boolean giveAllowance(Integer allowanceToBeTaken) {
		
		try {
			mutex.acquire();
			
			totalAllowanceToBeDistributed = totalAllowanceToBeDistributed - allowanceToBeTaken;
			
			mutex.release();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
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
