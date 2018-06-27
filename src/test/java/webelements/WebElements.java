package webelements;

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

public class WebElements {

	WebDriver driver;

	@BeforeMethod // runs once for all tests
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

	}

	@Test
	public void myLinks() {
		driver.get("https://github.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// List<WebElement> links = driver.findElements(By.xpath("//a"));-->>xpath

		// how many links on github home page
		int numberOfLinksOnGithub = links.size();
		System.out.println("number of links: " + numberOfLinksOnGithub);

		// print text of each link

		for (WebElement link : links) {
			if (!link.getText().isEmpty()) {
				System.out.println(link.getText());

			}
		}
		// add each link text into list of Strings
		List<String> linkNames = new ArrayList<>();
		for (WebElement link : links) {
			if (!link.getText().isEmpty()) {
				linkNames.add(link.getText());

			}

		}
		System.out.println(linkNames.toString());

	}
}
