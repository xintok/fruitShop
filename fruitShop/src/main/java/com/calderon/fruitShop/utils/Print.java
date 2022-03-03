package com.calderon.fruitShop.utils;

import com.calderon.fruitShop.models.Product;
import com.calderon.fruitShop.models.Receipt;

public class Print {

	//Print a message per console and exit 
	public static void error(String error) {
		System.out.print(error);
		System.exit(1);
	}
	
	//Print a message per console and exit 
	public static void message(String message) {
			System.out.print(message);
		}
	
	//Print a message per console and exit 
	public static void nonImplemented() {
				System.out.print(Constants.NON_IMPLEMENTED);
			}

	public static void receipt(Receipt receipt) {
		System.out.println(Constants.PRODUCTS);
		
		for (Product p : receipt.getProductos()) {
			System.out.println(p.getName());
		}
		
		System.out.printf(Constants.TOTAL, receipt.getTotal());
	}
	
	
	
}
