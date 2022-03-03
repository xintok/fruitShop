package com.calderon.fruitShop.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.calderon.fruitShop.models.Product;
import com.calderon.fruitShop.models.Purchase;



public class Utilities {
		
	
	public static List<Product> readProducts(String file) throws IOException {
		
		List<Product> products =  new ArrayList<>();

		BufferedReader br = null;
		String line = "";
	    String separator = ",";
	    
	    String name;
	    Double price;
		
		br = new BufferedReader(new FileReader(file));
		br.readLine();//header
		
		while ((line = br.readLine()) != null) {

            String[] row = line.split(separator);
            
            name = row[0];
            price = Double.valueOf(row[1]);
            
            products.add(new Product(name, price));
        }
		
		br.close();
		
		return products;
	}
	
	public static List<Purchase> readPurchase(String file) throws IOException {
		
		List<Purchase> purchase = new ArrayList<>();
		BufferedReader br = null;
		String line = "";
	    String separator = ",";
	    
	    String name;
	    int quantity;
		
		br = new BufferedReader(new FileReader(file));
		br.readLine();//header
		
		while ((line = br.readLine()) != null) {

            String[] row = line.split(separator);
            
            name = row[0];
            quantity = Integer.valueOf(row[1]);
            
            purchase.add(new Purchase(new Product(name), quantity));
        }
		
		br.close();
		
		return purchase;
	}
	

	

}