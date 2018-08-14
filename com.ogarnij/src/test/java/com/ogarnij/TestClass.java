package com.ogarnij;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class TestClass implements ValuesSet, PathsSet {
	final static Logger logger = Logger.getLogger(TestClass.class);
	public LocalSetUp x = new LocalSetUp();
	@BeforeTest
	public void setUpChromeDriver() {
		x.setDriver();

	}

	@Test
	public void callWebDriver() {
		ChromeDriver driver = new ChromeDriver();
		
		logger.error("zmiana");
		System.out.println("dupa");
		driver.get(onetLink);
		
	}

}
