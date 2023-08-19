package com.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_class;


public class Home_Page extends Base_class  {
	
	public Home_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class = 'loaderCat vipkids_menLdr dIb mA pA r0   h80 b4 l0 t0 ']")
	private WebElement kids;
	
	public WebElement getKids() {
		return kids;
	}
}
