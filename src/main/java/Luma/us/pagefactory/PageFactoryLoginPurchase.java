package Luma.us.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Luma.us.basepage.BasePage;
import Luma.us.generics.CommonUtility;
import Luma.us.generics.HighLightsElements;
import Luma.us.generics.WaitHelper;

public class PageFactoryLoginPurchase extends BasePage {

	public PageFactoryLoginPurchase() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//li[@class='authorization-link'])[1]")
	@CacheLookup
	private WebElement clickSignInBTN;

	public WebElement getClickSignInBTN() {
		return clickSignInBTN;

	}

	@FindBy(xpath = "(//input[@type='email'])[1]")
	@CacheLookup
	private WebElement enterUserName;

	public WebElement getEnterUserName() {
		return enterUserName;
	}

	@FindBy(xpath = "(//input[@type='password'])[1]")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	@CacheLookup
	private WebElement clickLogin;

	public WebElement getClickLogin() {
		return clickLogin;
	}

	@FindBy(xpath = "//*[text()='Welcome, Smart Tech!']")
	@CacheLookup
	private WebElement landingPageText;

	public WebElement getVerifiedlandingPageText() {
		return landingPageText;
	}
	// ============***************************=========================

	@FindBy(xpath = "(//span[text()='Men'])[1]")
	@CacheLookup
	private WebElement menModule;

	public WebElement getMenModule() {
		return menModule;
	}

	@FindBy(xpath = "(//span[text()='Tops'])[2]")
	@CacheLookup
	private WebElement selectTops;

	public WebElement getSelectTops() {
		return selectTops;
	}

	@FindBy(xpath = "(//span[text()='Jackets'])[2]")
	@CacheLookup
	private WebElement selectJacket;

	public WebElement getSelectJacket() {
		return selectJacket;

	}

	@FindBy(linkText = "Jupiter All-Weather Trainer")

	@CacheLookup
	private WebElement selectJupiterJacket;

	public WebElement getSelectJupiterJacket() {
		return selectJupiterJacket;
	}

	@FindBy(xpath = "(//div[@class='swatch-option text'])[12]")
	@CacheLookup
	private WebElement selectSize;

	public WebElement getSelectsize() {
		return selectSize;
	}

	@FindBy(xpath = "(//div[@class='swatch-option color'])[7]")

	@CacheLookup
	private WebElement selectColor;

	public WebElement getSelectColor() {
		return selectColor;
	}
	//

	// @FindBy(xpath = "(//div[@class='swatch-option color'])[7]")

	// @ CacheLookup
	// private WebElement selectQuantity;
	//// public WebElement getSelectQuantity() {
	// return selectQuantity;
	// }

	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")

	@CacheLookup
	private WebElement adToCart;

	public WebElement getAddToCart() {
		return adToCart;
	}

	@FindBy(linkText = "shopping cart")

	@CacheLookup
	private WebElement clickOnShoppingCart;

	public WebElement getclickOnShoppingCart() {
		return clickOnShoppingCart;
	}

	@FindBy(xpath = "(//button[@title='Proceed to Checkout'])[2]")

	@CacheLookup
	private WebElement proceedToCart;

	public WebElement getClickProceedToCart() {
		return proceedToCart;
	}

	// ******>>>
	@FindBy(xpath = "//*[text()='New Address']")

	// @FindBy(xpath = "//div[@class='new-address-popup']")
	@CacheLookup
	private WebElement addNewAddress;

	public WebElement getClickNewAddress() {
		return addNewAddress;
	}

	// ******>>>Adding Shipping Details from here

	@FindBy(xpath = "(//input[@class='input-text'])[6]")
	@CacheLookup
	private WebElement addFirstName;

	public WebElement getAddFirstName() {
		return addFirstName;
	}

	// ******>>>
	@FindBy(xpath = "(//input[@class='input-text'])[7]")
	@CacheLookup
	private WebElement addLastName;

	public WebElement getAddLastName() {
		return addLastName;
	}

	// ******>>>
	@FindBy(xpath = "//input[@name='company']")
	@CacheLookup
	private WebElement addCompanyName;

	public WebElement getCompanyName() {
		return addCompanyName;
	}

	// ******>>>
	@FindBy(xpath = "//input[@name='street[0]']")
	@CacheLookup
	private WebElement addStreetName;

	public WebElement getAddStreetName() {
		return addStreetName;
	}

	// ******>>>
	@FindBy(xpath = "//input[@name='city']")
	@CacheLookup
	private WebElement addCityName;

	public WebElement getAddCityName() {
		return addCityName;
	}
	// ******>>>

	@FindBy(xpath = "(//select[@class='select'])[1]")
	@CacheLookup
	private WebElement SelectStateName;

	public WebElement getSelectStateName() {
		return SelectStateName;
	}
	// ******>>>

	@FindBy(xpath = "(//input[@class='input-text'])[14]")
	@CacheLookup
	private WebElement addZipCode;

	public WebElement getAddZipCode() {
		return addZipCode;
	}
	// ******>>>

	@FindBy(xpath = "(//select[@class='select'])[2]")
	@CacheLookup
	private WebElement SelectCountryName;

	public WebElement getSelectCountryName() {
		return SelectCountryName;
	}

	// ******>>>
	@FindBy(xpath = "(//input[@class='input-text'])[15]")
	@CacheLookup
	private WebElement addPhoneNumber;

	public WebElement getAddPhoneNUmber() {
		return addPhoneNumber;
	}

	@FindBy(xpath = "//span[text()='Ship here']")
	@CacheLookup
	private WebElement clickShipHere;

	public WebElement getClickShipHere() {
		return clickShipHere;
	}

	public void addNewShippingsDetails() {

		getAddFirstName().clear();
		WaitHelper.seleniumWait(getAddFirstName(), 30);
		getAddFirstName().sendKeys("Fatema");

		getAddLastName().clear();
		WaitHelper.seleniumWait(getAddLastName(), 30);
		getAddLastName().sendKeys("Zohora");

		getCompanyName().clear();
		WaitHelper.seleniumWait(getCompanyName(), 30);
		getCompanyName().sendKeys("Smart Tech");

		getAddStreetName().clear();
		WaitHelper.seleniumWait(getAddStreetName(), 30);
		getAddStreetName().sendKeys("78 11 Sutter Ave");

		getAddCityName().clear();
		WaitHelper.seleniumWait(getAddCityName(), 30);
		getAddCityName().sendKeys("Queens, NY");

		// ******>>>

		WaitHelper.seleniumWait(getSelectStateName(), 30);
		CommonUtility.getSelectValue(getSelectStateName(), "New York");

		// ****getSelectStateName().sendKeys("");***/

		getAddZipCode().clear();
		WaitHelper.seleniumWait(getAddZipCode(), 30);
		getAddZipCode().sendKeys("11417");

		WaitHelper.seleniumWait(getSelectCountryName(), 30);
		CommonUtility.getSelectValue(getSelectCountryName(), "United States");
		// ****getSelectCountryName().sendKeys("");***/

		getAddPhoneNUmber().clear();
		WaitHelper.seleniumWait(getAddPhoneNUmber(), 30);
		getAddPhoneNUmber().sendKeys("917 455 3331");

		WaitHelper.seleniumWait(getClickShipHere(), 30);
		CommonUtility.getActionClick(clickShipHere);

		// *****getClickShipHere()****/

	}

	public void getLogin() {
		log.info("User able to click on signin button");
		HighLightsElements.drawBorder(getClickSignInBTN());
		WaitHelper.seleniumWait(getClickSignInBTN(), 30);
		CommonUtility.getActionClick(getClickSignInBTN());

		log.info("User able to enter UserName");
		HighLightsElements.drawBorder(getEnterUserName());
		WaitHelper.seleniumWait(getEnterUserName(), 30);
		getEnterUserName().sendKeys(prop.getProperty("userName"));

		log.info("User able to enter Password");
		HighLightsElements.drawBorder(getEnterPassword());
		WaitHelper.seleniumWait(getEnterPassword(), 30);
		getEnterPassword().sendKeys(prop.getProperty("password"));

		log.info("User able to click on the login button");
		HighLightsElements.drawBorder(getClickLogin());
		WaitHelper.seleniumWait(getClickLogin(), 30);
		CommonUtility.getActionClick(getClickLogin());

	}

}
