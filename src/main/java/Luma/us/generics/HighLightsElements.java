package Luma.us.generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Luma.us.basepage.BasePage;

public class HighLightsElements extends BasePage {
	public static void drawBorder(WebElement ele) {
		//WebElement wele= driver.findElement(By.xpath(xpath));
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("arguments [0].style.border='5px solid green'", ele);
		
	}

}
