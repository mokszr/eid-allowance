package com.smartycoder.ramadan;

import java.util.ArrayList;
import java.util.List;

import com.smartycoder.ramadan.model.Grandson;
import com.smartycoder.ramadan.model.IGrandpa;
/**
 * 
 * @see https://www.smartycoder.com/
 *
 */
public class EidCelebration {
	
	public void eidMubarak(IGrandpa grandpa) {
 		
		List<HandKissingAndTakingAllowanceThread> handKissingThreads = new ArrayList<>();
		
		grandpa.setTotalAllowanceToBeDistributed(100000);
		
		int grandsonCount = 1000;
				
		int allowanceAmount = 100;
		
		for(int i = 0; i < grandsonCount; i++) {
			
			Grandson grandson = new Grandson(allowanceAmount);
			
			HandKissingAndTakingAllowanceThread handKissingThread = new HandKissingAndTakingAllowanceThread(grandpa, grandson);
			
			handKissingThreads.add(handKissingThread);
		}
		
		
		for(int i = 0; i < grandsonCount; i++) {
		
			handKissingThreads.get(i).start();
		}
		
		
		// Wait until all threads are finished
		for(int i = 0; i < grandsonCount; i++) {
			
			try {
				handKissingThreads.get(i).join();
				
				if(!handKissingThreads.get(i).getGrandson().canTakeAllowance()) {
					
					System.out.println( (i + 1) + ". grandson couldn't take allowance!!");
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(grandpa.getClass().getSimpleName() + " Finished. Remaining allowance he has: " + grandpa.geRemainingAllowance()); 
		if(grandpa.geRemainingAllowance() > 0) {
			
			System.out.println(grandpa.getClass().getSimpleName() + " FAILED!!!");
			
		} else {
			
			System.out.println("Good, there is no allowance remainig. Eid mubarak!");
		}
	}
}
