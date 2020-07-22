package com.javauser.test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import com.javauser.BeverageValue;
import com.javauser.utils.BevUtils;
import org.junit.Assert;
import org.junit.Test;

public class OrderWithoutMenuTest {
	// Validate amount for multiple menu Items with Exclusions --["Chai, -sugar", "Chai", "Coffee, -milk"]
		@Test
		public void orderWithMulMenuItems() {
			String firstMenu="Chai, -sugar";
			String secondMenu="Chai";
			String thirdMenu="Coffee, -milk";
			String beverage=BeverageValue.inputFormatter("["+firstMenu+","+secondMenu+","+thirdMenu+"]");
			String[] values =beverage.split(",");
			BeverageValue.calculateActualPrice(values);
			Double calValue=BeverageValue.calculateActualPrice(values);
			assertEquals(calValue, new Double("11.5"));
		}
		

}
