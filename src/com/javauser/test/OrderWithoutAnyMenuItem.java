package com.javauser.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javauser.BeverageValue;

public class OrderWithoutAnyMenuItem {

	
	// Validate order without any menu Item
		@Test
		public void amountValue() {
			String beverage=BeverageValue.inputFormatter("");
			assertEquals(beverage, "");
		}
		
		// Validate order without any multiple menu Items	
		@Test
		public void orderWithMulMenuItems() {
			String firstMenu="";
			String secondMenu="";
			String thirdMenu="";
			String beverage=BeverageValue.inputFormatter("["+firstMenu+","+secondMenu+","+thirdMenu+"]");
			String[] values =beverage.split(",");
			assertEquals(values.length, 0);
		}	
}
