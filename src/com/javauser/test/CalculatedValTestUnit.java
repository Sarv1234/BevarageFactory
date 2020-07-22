package com.javauser.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javauser.BeverageValue;

public class CalculatedValTestUnit {
// Validate amount for one exclusion -Chai without Sugar
	@Test
	public void amountValue() {
		String beverage=BeverageValue.inputFormatter("Chai,-sugar");
		String[] values =beverage.split(",");
		BeverageValue.calculateActualPrice(values);
		Double calValue=BeverageValue.calculateActualPrice(values);
		assertEquals(calValue, new Double("3.5"));
	}
	
}
