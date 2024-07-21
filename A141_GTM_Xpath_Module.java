package Xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A141_GTM_Xpath_Module
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver d1= new ChromeDriver();
	d1.get("https://grotechminds.com/x-path/");
	d1.manage().window().maximize();
	
	//relative x-path 
	//syntax1: "(//tagname)[index value]";
	//syntax2: //tagname[@attribute name = 'attribute value'];
	
	
	WebElement firstname=d1.findElement(By.xpath("(//input)[2]"));
	firstname.sendKeys("Anusha");
	
	WebElement lastname=d1.findElement(By.xpath("//input[@id='LastName']"));
	lastname.sendKeys("Channa");
	
	WebElement middlename =d1.findElement(By.xpath("//input[@id='MiddleName']"));
	middlename.sendKeys(" ");
	
	WebElement WorkPlaceAddress=d1.findElement(By.xpath("//textarea[@id='Work-Place-Address']"));
	WorkPlaceAddress.sendKeys("Banglore");
	
	WebElement HomeAddress=d1.findElement(By.xpath("//textarea[@id='home-address']"));
	HomeAddress.sendKeys("Kavali");
	
	WebElement PersonalEmail=d1.findElement(By.xpath("//input[@id='Personal-Email']"));
	PersonalEmail.sendKeys("Anusha@gmail.com");
	
	WebElement CorporateEmail =d1.findElement(By.xpath("//input[@id='Corporate-email']"));
	CorporateEmail.sendKeys("Anusha@corporatemail.com");
		
	WebElement MobileNumber=d1.findElement(By.xpath("//input[@id='tel']"));
	MobileNumber.sendKeys("9876543210");
	
	Thread.sleep(5000);
	d1.close();
}


}
