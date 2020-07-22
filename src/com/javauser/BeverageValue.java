package com.javauser;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import com.javauser.utils.BevUtils;
import com.javauser.utils.IngredentUtils;

public class BeverageValue {

	/**
	 * @param values
	 * @return
	 */
	public static Double calculateActualPrice(String[] values) {
		Double price=0.0;
		try {
			
			List<String> bevList=Arrays.asList(values);
			List<String> bevTypeList=BevUtils.BeverageType();
			
			for (String string : bevList) {
				if(bevTypeList.contains(string.toLowerCase())) {
					price=price+BevUtils.getBeveragePrice().get(string.toLowerCase());
				}else {
					if(string.contains("-")) {
						
						price=price-IngredentUtils.getIngredientPrice().get(string.substring(1).toLowerCase());

					}
					
				}
			}
		} catch (Exception e) {
          e.printStackTrace();
		}
		return price;
	} 
	
	public static String inputFormatter(String value) {
		Reader reader=new CharArrayReader(value.toCharArray());
		BufferedReader b = new BufferedReader(reader);
		String result="";
		int i;
		try {
			while ((i=b.read())!=-1) {
				if(!((char) i=='"' || (char) i=='[' || (char) i==']' || (char) i==' ')) {
					result=result+(char)i;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return result;
			
		}
	
	
	public static void main(String[] args) {
		Double calValue=new Double("0.0");
		  List<String> words = new ArrayList<String>();
		try {
			System.out.println("Enter Your Order");
			Scanner myObj = new Scanner(System.in);
			String readIp = myObj.nextLine();
			String beverage=inputFormatter(readIp);
            String[] values =beverage.split(",");
            
			if(values.length==0) {
				System.out.println("Not a Relevant Beverage");
			}else if(values.length==1) {
				calValue =new BevUtils().getBeveragePrice().get(values[0]);
				
				System.out.println("Price of your beverage "+values[0]+" is "+calValue+"$");
			}else {
				
				calValue=calculateActualPrice(values);
				
				System.out.println("Price of your beverage "+beverage+" is "+calValue+"$");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
