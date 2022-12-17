package Luma.us.generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Luma.us.basepage.BasePage;

public class CommonUtility extends BasePage{
	public static void getActionClick(WebElement ele) {
		Actions click = new Actions(driver);
		click.click(ele).build().perform();
		
	}
	
	public static void getJSClick (WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
	}
	
	public static void getAssert(String expected,String actual) {
		Assert.assertEquals(expected, actual);
		System.out.println("Verifyed text "+ actual);
		
	}
	
	public static void mouseHover(WebElement ele) {
		Actions act = new Actions(driver); 
		act.moveToElement(ele).build().perform();
	}
	
	public static void getSelectValue(WebElement ele, String str) {
		Select sel  = new Select(ele);
		sel.selectByVisibleText(str);
		
	
	}

}
