package Xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A139_C46_Facebook_attributes
{
public static void main(String[] args) {
	ChromeDriver d1= new ChromeDriver();
	d1.get("https://www.facebook.com/login/");
	d1.manage().window().maximize();
	
	WebElement d2=d1.findElement(By.xpath("//input[@id='email']"));
	d2.sendKeys("09876543211");
	WebElement d3=d1.findElement(By.xpath("//input[@name='pass']"));
	d3.sendKeys("09876543211");
	WebElement d4=d1.findElement(By.xpath("//button[@name='login']"));
	d4.click();
}
}
