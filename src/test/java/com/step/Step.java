package com.step;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import com.base.Base_class;
import com.pagefactory.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Step extends Base_class {
	public static Robot r1;
	PageObjectManager pom = new PageObjectManager();

	//Step definition class
	@Given("user open the {string} browser")
	public void user_open_the_browser(String S) {
		browserLaunch(S);
	}

	@Given("Launch the url {string}")
	public void launch_the_url(String string) throws IOException {

		getUrl(string);
	}
	
	@Given("click the shop men")
	public void click_the_shop_men() {
		pom.getShop_men().getShopMen().click();
		implicitlyWait(15);
	}
	@Then("user lands on HomePage")
	public void user_lands_on_home_page() {
		String title = driver.getTitle();
		System.out.println(title);
		implicitlyWait(15);
	}

	@Given("user click on kids option in HomePage")
	public void user_click_on_kids_option_in_home_page() {
		pom.getHome_page().getKids().click();
		try {
			waitThread(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("user click on striped tees option")
	public void user_click_on_better_basic_option() throws AWTException {
		implicitlyWait(15);
		r1 = new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		r1.keyRelease(KeyEvent.VK_TAB);
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		pom.getStriped_tees().getStriped_Tshirt().click();
	}
	@When("user click blue cotton T-shirt")
	public void user_click_blue_cotton_t_shirt() throws AWTException {
		implicitlyWait(15);
		r1 = new Robot();
		pom.getStriped_tees().getContext_click().click();
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		pom.getStriped_tees().getCombo_Tees().click();
	}

	@Then("user select the t-shirt size")
	public void user_select_the_t_shirt_size() {
		pom.getStriped_tees().getSize().click();
	}

	@Then("user click on Add to cart button")
	public void user_click_on_add_to_cart_button() {
		pom.getStriped_tees().getCart_button().click();
		try {
			waitThread(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			screenshot("Limeroad_ShoppingCart");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
