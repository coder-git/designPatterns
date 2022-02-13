package com.design.mode1;

import java.math.BigDecimal;

public class NumberFactoryImplement implements NumberFactory{

	@Override
	public Number parse(String s) {

		return new BigDecimal(s);
	}
	

}
