package com.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_class;

public class Shopmen extends Base_class {
	
	public Shopmen() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='SHOP MEN']")
	private WebElement shopMen;
	
	public WebElement getShopMen() {
		return shopMen;
	}
}
