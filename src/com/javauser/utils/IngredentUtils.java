package com.javauser.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IngredentUtils {

	public static Map<String, Double> getIngredientPrice() {
		Map<String, Double> valMap = new HashMap<String, Double>();
		try {
			valMap.put("milk", (double) 1);
			valMap.put("sugar", (double) 0.5);
			valMap.put("soda", (double) 0.5);
			valMap.put("mint", (double) 0.5);
			valMap.put("water", (double) 0.5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valMap;
	}
}
