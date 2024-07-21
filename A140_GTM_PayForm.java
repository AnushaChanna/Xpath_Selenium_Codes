package Xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A140_GTM_PayForm
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver d1= new ChromeDriver();
	d1.get("https://grotechminds.com/payments/");
	d1.manage().window().maximize();
	
	WebElement card=d1.findElement(By.xpath("//input[@id='cardNumber']"));
	card.sendKeys("09876543211");
	
	WebElement expirydate=d1.findElement(By.xpath("//input[@name='expiryDate']"));
	expirydate.sendKeys("09/2030");
	
	WebElement cvv=d1.findElement(By.xpath("//input[@id='cvv']"));
	cvv.sendKeys("999");
	
	WebElement amount=d1.findElement(By.xpath("//input[@id='amount']"));
	amount.sendKeys("1091996");
	
	WebElement checkbox=d1.findElement(By.xpath("//input[@id='saveCard']"));
	checkbox.click();
	
	
	Thread.sleep(5000);
	d1.close();
	
}
}
