package Luma.us.stepdefinition;

import org.openqa.selenium.support.PageFactory;

import Luma.us.basepage.BasePage;
import Luma.us.generics.CommonUtility;
import Luma.us.generics.HighLightsElements;
import Luma.us.generics.WaitHelper;
import Luma.us.pagefactory.PageFactoryLoginPurchase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Men_Functional_Stepdef extends BasePage {
	
PageFactoryLoginPurchase pf;
	
	@Given("User already logged in the application and verify the user information on the landing page")
	public void user_already_logged_in_the_application_and_verify_the_user_information_on_the_landing_page() throws Throwable {
	pf =	PageFactory.initElements(driver, PageFactoryLoginPurchase.class);
	pf.getLogin();
	
	//In order to keep track to keep our execution time,date,we have to use logger.
	  log.info("User able to verify thge landing page");
	  String expected = prop.getProperty("LandingPageTitle");
	  //In order to highlight elements the elements we can get help from java script executor.
	  HighLightsElements.drawBorder(pf.getVerifiedlandingPageText());
	  //In order to avoid synchronization issue we need help from exeplicit wait from selenium.
	  WaitHelper.seleniumWait(pf.getVerifiedlandingPageText(), 30);
	  //In order to validate the requirement we have to use assertion.either TestNG or from Junit.
	  String actual = pf.getVerifiedlandingPageText().getText();
	 // In orde to verify the text we have to use either getText()or getAttribute()
	  CommonUtility.getAssert(expected,actual);
	}
	
	@When("User should be able to select Jupiter All-Weather Trainer jacket from men module")
	public void user_should_be_able_to_select_jupiter_all_weather_trainer_jacket_from_men_module() {
	log.info("User able to mouseHover the menModule");
	HighLightsElements.drawBorder(pf.getMenModule());
	WaitHelper.seleniumWait(pf.getMenModule(), 30);
	//In order to handle mousehoverover we need help from Action Class.
	CommonUtility.mouseHover(pf.getMenModule());
	
	log.info("User able to mouseHover the Tops");
	WaitHelper.seleniumWait(pf.getSelectTops(), 30);
	CommonUtility.mouseHover(pf.getSelectTops());
	
	log.info("User able to click on Jacket");
	WaitHelper.seleniumWait(pf.getSelectJacket(), 30);
	//In order to click webElement we can use Actions Class.Also we can use JavascriptExecuter.
	
	CommonUtility.getJSClick(pf.getSelectJacket());
	 
	}
	@When("Verify the jacket name on the Jupiter All-Weather Trainer list")
	public void verify_the_jacket_name_on_the_jupiter_all_weather_trainer_list() {
		
		log.info("User able to verify specific Jacket");
		String expected = prop.getProperty("JacketName"); 
		WaitHelper.seleniumWait(pf.getSelectJupiterJacket(), 30);
		String actual = pf.getSelectJupiterJacket().getText(); 
		CommonUtility.getAssert(expected,actual);

	   
	}
	@When("User should be able to select the S and Blue and {int} then click on the add to cart")
	public void user_should_be_able_to_select_the_s_and_blue_and_then_click_on_the_add_to_cart(Integer int1) {
		log.info("User able to select the size");
		WaitHelper.seleniumWait(pf.getSelectsize(), 30);
		CommonUtility.getActionClick(pf.getSelectsize());
		
		log.info("User able to select the color");
		WaitHelper.seleniumWait(pf.getSelectColor(), 30);
		CommonUtility.getActionClick(pf.getSelectColor());
		
		
		log.info("User able to select Add to cart");
		WaitHelper.seleniumWait(pf.getAddToCart(), 30);
		CommonUtility.getActionClick(pf.getAddToCart());
	}
		
		@When("User should be able to click on the cart")
		public void user_should_be_able_to_click_on_the_cart() {
		log.info("User able to click on the shopping cart");
		WaitHelper.seleniumWait(pf.getclickOnShoppingCart(), 30);
		CommonUtility.getActionClick(pf.getclickOnShoppingCart());
		
		//---->
		
	}
	@When("User should be able to click on the checkout")
	public void user_should_be_able_to_click_on_the_checkout() {
		log.info("User able to click on proceed to checkout");
		WaitHelper.seleniumWait(pf.getClickProceedToCart(), 30);
		CommonUtility.getActionClick(pf.getClickProceedToCart());
	}
	//-->^
	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {
		log.info("User able to click on New Address");
		WaitHelper.seleniumWait(pf.getClickNewAddress(), 30);
		//CommonUtility.getActionClick(pf.getClickNewAddress());
		CommonUtility.getJSClick(pf.getClickNewAddress());
		
	   }
//--->
	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {
		pf.addNewShippingsDetails();
	   
	}
	@Then("User should be able to verify the order number and get text on the screen “Thank you for your purchase!”")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen_thank_you_for_your_purchase() {

	   
	}

	
	
	
	
	

}
