package com.smartycoder.ramadan;

import com.smartycoder.ramadan.model.AtomicGrandpa;
import com.smartycoder.ramadan.model.Grandpa;
import com.smartycoder.ramadan.model.SemaphoreGrandpa;
import com.smartycoder.ramadan.model.SynchronizedGrandpa;

/**
 * 
 * @see https://www.smartycoder.com/
 *
 */
public class EidApp {

	public static void main(String[] args) {
		
		System.out.println("Grandpas should have none remaining allowance after allowance distribution!");
		System.out.println("--------");
		System.out.println("Starting");
		System.out.println("--------");
		
		Grandpa grandpa = new Grandpa();
		
		AtomicGrandpa atomicGrandpa = new AtomicGrandpa();
		
		SynchronizedGrandpa synchronizedGrandpa = new SynchronizedGrandpa();
		
		SemaphoreGrandpa semaphoreGrandpa = new SemaphoreGrandpa();
		
		EidCelebration eidCelebration = new EidCelebration();
		
		long start = System.currentTimeMillis();
		
		eidCelebration.eidMubarak(grandpa);
		
		System.out.println("Grandpa calculation time: " + (System.currentTimeMillis() - start));
		
		System.out.println();
		
	
		start = System.currentTimeMillis();
		
		eidCelebration.eidMubarak(atomicGrandpa);
		
		System.out.println("AtomicGrandpa calculation time: " + (System.currentTimeMillis() - start));
		
		System.out.println();
		
		
		start = System.currentTimeMillis();
		
		eidCelebration.eidMubarak(synchronizedGrandpa);
		
		System.out.println("SynchronizedGrandpa calculation time: " + (System.currentTimeMillis() - start));
		
		System.out.println();
		
		
		start = System.currentTimeMillis();
		
		eidCelebration.eidMubarak(semaphoreGrandpa);
		
		System.out.println("SemaphoreGrandpa calculation time: " + (System.currentTimeMillis() - start));
		
		System.out.println();
		
	}
}
