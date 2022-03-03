package com.calderon.fruitShop.services;

import org.springframework.stereotype.Service;

import com.calderon.fruitShop.models.Receipt;

@Service
public interface ShopService {

	Receipt purchase (String productsFile, String purchaseFile);

	Receipt checkOffers(Receipt receipt);
	
}
