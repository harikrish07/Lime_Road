package com.pagefactory;

import com.homepage.Home_Page;
import com.login.Shopmen;
import com.stripedtees.Striped_Tshirt;


public class PageObjectManager {
	
	private Shopmen shop_men;
	private Home_Page home_page;
	private Striped_Tshirt striped_tees;
	
	public Shopmen getShop_men() {
		shop_men = new Shopmen();
		return shop_men;
	}
	
	public Home_Page getHome_page() {
		home_page = new Home_Page();
		return home_page;
	}
	
	public Striped_Tshirt getStriped_tees() {
		striped_tees = new Striped_Tshirt(); 
		return striped_tees;
	}
}
