package com.ltts.foodwiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodPanda {
	@Autowired()
	@Qualifier("chinese")
	Menu cmenu;
	@Autowired()
	@Qualifier("indian")
	Menu imenu;
	public List<String> showMenu(String choice)
	{
		if(choice.equals("chinese"))
		{
		 return cmenu.itemsAvailable();
		}
		else
		{
		return imenu.itemsAvailable();
		}
		
	}

}
