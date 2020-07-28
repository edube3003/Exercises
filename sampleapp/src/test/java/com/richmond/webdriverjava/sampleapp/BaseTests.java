package com.richmond.webdriverjava.sampleapp;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.richmond.webdriverjava.sampleapp.pages.HomePage;

public class BaseTests {
	
	private WebDriver driver;
	protected HomePage homePage;
	@Before
    public  void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get ("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
        
    }
	 @After
    public void tearDown() {
    	driver.quit();
    }
   

}
