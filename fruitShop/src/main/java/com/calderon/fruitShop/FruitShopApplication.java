package com.calderon.fruitShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FruitShopApplication {

	
	public static void main(String[] args) {
				
		 ConfigurableApplicationContext appContext = SpringApplication.run(FruitShopApplication.class, args);
		
		 Menu menu = appContext.getBean(Menu.class);
		 
		 menu.init(args);
	}

	
	
}
