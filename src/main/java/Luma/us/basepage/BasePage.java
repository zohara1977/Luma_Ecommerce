package Luma.us.basepage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	//How to initialize all the browser in BasePage class
	
	public BasePage(){
		log = Logger.getLogger("Test Lead Mebin");
		PropertyConfigurator.configure("log4jproperties");
		prop= new Properties();	
		FileInputStream fl;
		
		try {
			fl = new  FileInputStream("./src/main/java/Luma/us/config/Config.Properties");
			prop.load(fl);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			finally {
				System.out.println("Config file found");
			}
			
		}
		
	public static void startAutomation() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			log.info("Start Automation in chrome browser");
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("edge")) {
			log.info("Start Automation in edge browser");
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			log.info("Start Automation in firefox browser");
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	}


}
