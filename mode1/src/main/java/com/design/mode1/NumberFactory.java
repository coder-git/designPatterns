package com.design.mode1;

public interface NumberFactory {
	
	public static NumberFactory imple = new NumberFactoryImplement();
	
	Number parse(String s);
	
	static NumberFactory getFactory() {
		return imple;
	}
}
