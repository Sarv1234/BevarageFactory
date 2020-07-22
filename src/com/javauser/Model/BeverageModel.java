package com.javauser.Model;

import java.util.List;

public class BeverageModel {

	public List<String> beverage;
	public double price;
	public String beverageType;

	public List<String> getBeverage() {
		return beverage;
	}

	public void setBeverage(List<String> beverage) {
		this.beverage = beverage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBeverageType() {
		return beverageType;
	}

	public void setBeverageType(String beverageType) {
		this.beverageType = beverageType;
	}

}
