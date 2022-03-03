package com.calderon.fruitShop.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.calderon.fruitShop.models.Offer;
import com.calderon.fruitShop.models.Product;
import com.calderon.fruitShop.models.Purchase;
import com.calderon.fruitShop.models.Receipt;
import com.calderon.fruitShop.utils.Constants;
import com.calderon.fruitShop.utils.Print;
import com.calderon.fruitShop.utils.Utilities;

public class ShopServiceImpl implements ShopService{

	@Autowired
	public ShopService shopService;

	@Override
	public Receipt purchase(String productsFile, String purchaseFile) {

		Receipt receipt = new Receipt();
		List<Product> products = null;
		List<Purchase> purchase = null;
		Product product;
		Double total = 0.0;
		
		//Read product and purchase files
		try {
			products = Utilities.readProducts(productsFile);
			purchase = Utilities.readPurchase(purchaseFile);
		} catch (IOException e) {
			Print.error(Constants.ARGUMENTS_ERROR);
		}
		
		receipt.setProductos(products);
		
		for (Purchase p : purchase) {
			
			product = p.getProduct();
			
			if(products.contains(product)) {
				total += p.getQuantity()*product.getPrice();
			}
			
		}
		
		receipt.setTotal(total);
		
		receipt = shopService.checkOffers(receipt);
		
		return receipt;
	}

	
	/**
	 * Check if any offer can apply to the order
	 */
	@Override
	public Receipt checkOffers(Receipt receipt) {
		
		List<Offer> offers = new ArrayList<>();
		
		
		
		
		receipt.setOffers(offers);
		
		return receipt;
	}

	
	
	
}
