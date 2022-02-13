package com.design.mode1.staticFactory;

import java.math.BigDecimal;

public class NumberFactory {

	public static Number parse(String s ) {
		return new BigDecimal(s);
	}
}
