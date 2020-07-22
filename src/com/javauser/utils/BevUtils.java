package com.javauser.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.javauser.Model.BeverageModel;

public class BevUtils {
	
	public static List<String> BeverageType() {
		List<String> bevList = Arrays.asList("coffee", "chai", "banana smoothie", "strawberry shake", "mojito");
		return bevList;
	}

	public static Map<String, Double> getBeveragePrice() {
		Map<String, Double> valMap = new HashMap<String, Double>();
		try {
			valMap.put("coffee", (double) 5);
			valMap.put("chai", (double) 4);
			valMap.put("banana smoothie", (double) 6);
			valMap.put("strawberry shake", (double) 7);
			valMap.put("mojito", (double) 7.5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valMap;
	}

	public static Map<String, List<String>> getBevMap() {
		Map<String, List<String>> valMap = new HashMap<String, List<String>>();
		try {
			valMap.put("coffee", Arrays.asList("coffee", "milk", "sugar", "water"));
			valMap.put("chai", Arrays.asList("tea", "milk", "sugar", "water"));
			valMap.put("banana smoothie", Arrays.asList("banana", "milk", "sugar", "water"));
			valMap.put("strawberry shake", Arrays.asList("strawberries", "sugar", "milk", "water"));
			valMap.put("mojito", Arrays.asList("lemon", "sugar", "water", "soda", "mint"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valMap;
	}

	public List<BeverageModel> getBeverageList() {
		List<BeverageModel> beverageList = new ArrayList<BeverageModel>();
		Map<String, List<String>> bevMap = new HashMap<String, List<String>>();
		Map<String, Double> getPrice = new HashMap<String, Double>();
		List<String> bevList = new ArrayList<String>();
		try {
			bevMap = getBevMap();
			getPrice = getBeveragePrice();
			bevList = BeverageType();
			for (String beverVal : bevList) {
				BeverageModel beverageMenu = new BeverageModel();
				beverageMenu.setBeverage(bevMap.get(beverVal.toLowerCase()));
				beverageMenu.setBeverageType(beverVal);
				beverageMenu.setPrice(getPrice.get(beverVal.toLowerCase()));
				beverageList.add(beverageMenu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
     return beverageList;
	}


}
