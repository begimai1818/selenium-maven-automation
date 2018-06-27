package turkishairline;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TurkishAirlines {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/begimaikanybek/Documents/Selenium dependencies/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		String url = "https://www.turkishairlines.com/";
		driver.get(url);
		// how to handle cookies
		Thread.sleep(4000);
		try {
			driver.findElement(By.id("cookieWarningCloseId")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// FROM
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-id ='from_select']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='originSelector']//div/input")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='originSelector']//div/input"))
				.sendKeys("Los Angeles" + Keys.DOWN + Keys.ENTER);
		Thread.sleep(2000);
		// TO
		driver.findElement(By.xpath("//div[@id='destinationSelector']//div/input"))
				.sendKeys("Ataturk" + Keys.DOWN + Keys.ENTER);
		Thread.sleep(1000);
		// Go next in calendar
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		Thread.sleep(1000);
		// selecting dates
		driver.findElement(By.xpath("//a[@aria-label = 'August 12']")).click();
		driver.findElement(By.xpath("//a[@aria-label = 'August 18']")).click();
		Thread.sleep(1000);
		// selecting cabin types
		driver.findElement(By.id("cabinTypeSelector")).click();
		driver.findElement(By.linkText("Business Class")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@name ='upperCountSpinner'])[1]")).click();
		Thread.sleep(4000);
		// search
		driver.findElement(By.id("executeSingleCitySubmit")).click();
		Thread.sleep(1000);

	}

}
//package TurkishAirlines;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class TurkishAirlines {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver",
//				"/Users/aylin/Documents/Selenium Dependencies/drivers/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		String url = "https://www.turkishairlines.com/";
//		driver.get(url);
//
//		Thread.sleep(5000);
//		// Closing cookies
//		try {
//			driver.findElement(By.id("cookieWarningCloseId")).click();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		Thread.sleep(500);
//		
//		// From
//		driver.findElement(By.xpath("//button[@data-id='from_select']")).click();
//		driver.findElement(By.xpath("//div[@id='originSelector']//div/input")).clear();
//		driver.findElement(By.xpath("//div[@id='originSelector']//div/input"))
//				.sendKeys("Los Angeles" + Keys.DOWN + Keys.ENTER);
//		Thread.sleep(2000);
//		// To
//		driver.findElement(By.xpath("//div[@id='destinationSelector']//div/input"))
//				.sendKeys("Ataturk" + Keys.DOWN + Keys.ENTER);
//		// Go Next in calendar
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@title='Next']")).click();
//
//		// Selecting dates
//		driver.findElement(By.xpath("//a[contains(@aria-label,'August 10')]")).click();
//		driver.findElement(By.xpath("//a[contains(@aria-label,'August 25')]")).click();
//
//		// Selecting cabin type
//		driver.findElement(By.id("cabinTypeSelector")).click();
//		driver.findElement(By.linkText("Business Class")).click();
//		Thread.sleep(500);
//		// Adding passenger
//		driver.findElement(By.name("upperCountSpinner")).click();
//
//		// Submit flight
//		driver.findElement(By.id("executeSingleCitySubmit")).click();
//		Thread.sleep(12000);
//		
//		//Selecting flights time
//		driver.findElement(By.xpath("//a[contains(@aria-label,'Fare')]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.id("cTooltip_00")).click(); //OUTBOUND
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//a[contains(@aria-label,'Select this flight')]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//a[contains(@aria-label,'Fare')]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.id("cTooltip_10")).click(); //INBOUND
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//a[contains(@aria-label,'Select this flight')]")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//span[text()='Continue']")).click();
//
//	}
//}
