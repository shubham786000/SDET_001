package com.crm.autoDesk.genericUtility;

import java.util.Random;

public class JavaUtility {

	// this method generates random numbers
	
	public int getRandom()
	{
		Random r = new Random();
		int num = r.nextInt(1000);
		return num;
		
	}

}
