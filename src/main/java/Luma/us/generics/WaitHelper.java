package Luma.us.generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Luma.us.basepage.BasePage;

public class WaitHelper extends BasePage {
	public static void seleniumWait(WebElement ele,long time ) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

}
