package Xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A138_AmazonSignIn 
{
	//while doing amazon sign in email /mbl no should be given correct one only
	public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	
	WebElement signin=driver.findElement(By.xpath("(//input)[9]"));
	signin.sendKeys("+919876543210");
	
	WebElement continue1=driver.findElement(By.xpath("(//input)[12]"));
	continue1.click();

	WebElement pass=driver.findElement(By.xpath("(//input)[9]"));
	pass.sendKeys("Anusha");
	
	WebElement continue2=driver.findElement(By.xpath("(//input)[10]"));
	continue2.click();
	}
}
