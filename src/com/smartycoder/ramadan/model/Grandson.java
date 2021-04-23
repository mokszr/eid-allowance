package com.smartycoder.ramadan.model;
/**
 * 
 * @see https://www.smartycoder.com/
 *
 */
public class Grandson {

	private Integer allowanceToBeTaken;
	
	private boolean canTakeAllowance;

	public Grandson(Integer allowanceToBeTaken) {
		this.allowanceToBeTaken = allowanceToBeTaken;
	}

	public void kissGrandpasHand(IGrandpa dede) {

		canTakeAllowance = dede.giveAllowance(allowanceToBeTaken);
	}
	
	public boolean canTakeAllowance() {
		return canTakeAllowance;
	}
}
