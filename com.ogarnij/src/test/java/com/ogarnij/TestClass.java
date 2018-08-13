package com.ogarnij;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class TestClass {
	final static Logger logger = Logger.getLogger(TestClass.class);

	@BeforeTest
	public void setUpChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JakubKaczynski\\Downloads\\selenium-java-3.13.0\\chromedriver.exe");


	}

	@Test
	public void callWebDriver() {
		ChromeDriver driver = new ChromeDriver();
		
		logger.error("zmiana");
		System.out.println("dupa");
		driver.get("https://www.onet.pl");
		
	}

}
