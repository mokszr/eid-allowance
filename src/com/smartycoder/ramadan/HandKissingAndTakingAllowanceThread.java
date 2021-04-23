package com.smartycoder.ramadan;

import com.smartycoder.ramadan.model.Grandson;
import com.smartycoder.ramadan.model.IGrandpa;
/**
 * 
 * @see https://www.smartycoder.com/
 *
 */
public class HandKissingAndTakingAllowanceThread  extends Thread {

	private IGrandpa grandpa;
	
	private Grandson grandson;
	
	public HandKissingAndTakingAllowanceThread(IGrandpa grandpa, Grandson grandson) {
		this.grandpa = grandpa;
		this.grandson = grandson;
	}

	@Override
	public void run() {

		grandson.kissGrandpasHand(grandpa);
	}
	
	public Grandson getGrandson() {
		return grandson;
	}
}
