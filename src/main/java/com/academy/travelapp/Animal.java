package com.academy.travelapp;

public interface Animal extends Base {
	
	/**
	 * Returns Hunger as a percentage
	 * @return
	 */
	public int howhungry();
	
	/**
	 * when fed the animal is 30% less hungry 
	 */
	public void feeds();
	
	
}
