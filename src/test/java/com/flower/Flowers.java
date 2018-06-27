package com.flower;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flowers {

	WebDriver driver;

	@BeforeMethod // runs once for all tests
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

	}
	
	@Test
	   public void slideShow() throws InterruptedException {
	       driver.get("https://www.hbloom.com/Gifts/birthday-flowers");
	       List<WebElement> images = driver.findElements(By.tagName("img"));
	       List<String> srcs = new ArrayList<>();
	       
	       for(WebElement flower: images) {
	           srcs.add(flower.getAttribute("src"));
	       }
	       
	       for (String link : srcs) {
	           driver.get(link);
	           Thread.sleep(1234);
	       }
	    }
	
	
	
	

}
