package com.access.modifier.check2;

import com.access.modifier.check1.BaseClass1;

public class BaseClass2 extends BaseClass1 {

	int i;
	String j;
	
	public static void main(String[] args) {
		BaseClass2 base2 = new BaseClass2();
		
		//CompilerError
		//The field BaseClass1.defaultAge is not visible
		//base2.defaultAge=0;
		base2.publicAge = 0;
				
	}
	
}
