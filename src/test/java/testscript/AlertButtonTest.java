package testscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("(//button[contains(text(), 'Click me!')])[1]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text : "+ alert.getText());
		alert.accept();
		
		//Handling Confirmation alert
		driver.findElement(By.xpath("(//button[contains(text(), 'Click me!')])[2]")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println("Alert Text : "+ confirm.getText());
		confirm.dismiss();
		
		//Handling Prompt alert
		driver.findElement(By.xpath("(//button[contains(text(), 'prompt')]")).click();
		Alert prompt = driver.switchTo().alert();
		System.out.println("Alert Text : "+ prompt.getText());
		prompt.sendKeys("Hello Welcome");
		prompt.accept();
	//	prompt.dismiss();
		
		

	}

}
