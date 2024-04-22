package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GooglePageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ChromeOptions options = new ChromeOptions();
	//	options.setBrowserVersion("115");
	//	options.addArguments("--headless");
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		System.out.println("Page title : ...." + driver.getTitle());
	//	locators strategy
	//	WebElement srcBox = driver.findElement(By.id("APjFqb"));
	//	WebElement srcBox = driver.findElement(By.name("q"));
	//	WebElement srcBox = driver.findElement(By.className("gLFyf"));
		WebElement srcBox = driver.findElement(By.tagName("textarea"));
		
		srcBox.sendKeys("Java Tutorial");
		srcBox.sendKeys(Keys.ENTER);
		
		System.out.println("Page title : ...." + driver.getTitle());
		System.out.println("New URL : " + driver.getCurrentUrl());
		
		driver.navigate().back();
		
		System.out.println("page title after back...." + driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		
		
	}
	

}
