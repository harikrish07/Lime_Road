package com.stripedtees;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_class;

public class Striped_Tshirt extends Base_class {

	public Striped_Tshirt() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class = 'bs oH toE strC pR taL p4  bd2E br4 bgF m6  fg2t dIb vT'])[10]")
	private WebElement striped_Tshirt;
	
	@FindBy(xpath = "//img[@id = '19484494']")
	private WebElement combo_Tees;
	
	@FindBy(xpath= "//div[text()='Smart Staples For Boys']")
	private WebElement context_click;
	
	@FindBy(xpath = "//span[text()=' 2-3 Y ']")
	private WebElement size;
	
	@FindBy(xpath = "//div[text() = 'ADD TO CART']")
	private WebElement cart_button;
	
	public WebElement getStriped_Tshirt() {
		return striped_Tshirt;
	}
	
	public WebElement getCombo_Tees() {
		return combo_Tees;
	}
	
	public WebElement getContext_click() {
		return context_click;
	}
	
	public WebElement getSize() {
		return size;
	}
	
	public WebElement getCart_button() {
		return cart_button;
	}
}
