package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		//from mainpage to fram1
		driver.switchTo().frame("frame1");
		WebElement inpBox = driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.sendKeys("Hello Welcome");
		
		//frame 1 to frame 3
		driver.switchTo().frame("frame3");
		//by Index switch
	//	driver.switchTo().frame(0);
		driver.findElement(By.id("a")).click();
		
		//frame 3 to frame1
		driver.switchTo().parentFrame();
		inpBox = driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.clear();
		inpBox.sendKeys("Welcome Back");
		
		//frame 1 to main page
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//label//span")).getText());

	}

}
