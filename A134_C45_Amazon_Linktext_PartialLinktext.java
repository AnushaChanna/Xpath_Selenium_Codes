package Xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class A134_C45_Amazon_Linktext_PartialLinktext 
{
	public static void main(String[] args) 
	{
		//linktext
		//customerservice
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement customerservice=driver.findElement(By.linkText("Customer Service"));
		customerservice.click();
		
		driver.quit();
		
		//mobile
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.amazon.in/");
		driver1.manage().window().maximize();
		
		WebElement mobile1=driver1.findElement(By.linkText("Mobiles"));
		mobile1.click();
		
		driver1.close();
		
		//partial linktext
		//customer
		EdgeDriver driver2=new EdgeDriver();
		driver2.get("https://www.amazon.in/");
		driver2.manage().window().maximize();
		
		WebElement customerservice1=driver2.findElement(By.partialLinkText("mer"));
		customerservice1.click();

		driver2.quit();
		
		//mobile
		
		EdgeDriver driver3=new EdgeDriver();
		driver3.get("https://www.amazon.in/");
		driver3.manage().window().maximize();
		
		WebElement mobile2=driver3.findElement(By.partialLinkText("bil"));
		mobile2.click();
		
		driver3.close();
		
	}
}
