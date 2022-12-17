package Luma.us.hooks;

import Luma.us.basepage.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage{
	@Before
	public void getSetUp() {
		BasePage.startAutomation();
		
		
	}
	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(5000);
		//driver.quit();
	}

	
	

}
