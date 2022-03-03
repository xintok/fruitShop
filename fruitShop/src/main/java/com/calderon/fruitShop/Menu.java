package com.calderon.fruitShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.calderon.fruitShop.models.Receipt;
import com.calderon.fruitShop.services.ShopService;
import com.calderon.fruitShop.utils.Constants;
import com.calderon.fruitShop.utils.Print;

@Service
@Scope("singleton")
public class Menu {

	@Autowired
	public ShopService productService;
	
	
	public void init(String[] args) {
		
		String option = args[0];
		
		if(args.length<1) {
			Print.error(Constants.ARGUMENTS_ERROR);
		}
		
		switch(option) {
		
		case Constants.PURCHASE:
			
			if(args.length<3) {
				Print.error(Constants.ARGUMENTS_ERROR);
			}
			
			String productsFile = args[1];
			String purchaseFile = args[2];
			
			
			Receipt receipt = productService.purchase(productsFile, purchaseFile);
			
			Print.receipt(receipt);
			
			break;
		case Constants.OFFERS:
			
			
			
			break;
		case Constants.ADD_OFFER:
			
			
			
			break;
		case Constants.REMOVE_OFFER:
			
			
			break;
		default:
			Print.error(Constants.ARGUMENTS_ERROR);
			break;
		
		}
		
	}
	
	
}
