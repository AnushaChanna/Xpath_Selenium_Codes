package Xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A137_C45_RegisterGTM_Xpath 
{
	//https://grotechminds.com/registration/
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement A1=driver.findElement(By.id("fname"));
		A1.click();
		
		WebElement A2=driver.findElement(By.xpath("(//input)[29]"));
		A2.sendKeys("Anusha");
		WebElement lastname=driver.findElement(By.xpath("(//input)[30]"));
		lastname.sendKeys("Channa");
		WebElement email=driver.findElement(By.xpath("(//input)[31]"));
		email.sendKeys("Anusha@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("(//input)[32]"));
		pass.sendKeys("9876543210");
	
		WebElement gender=driver.findElement(By.xpath("(//input)[34]"));
		gender.click();
		
		WebElement PresentAddress=driver.findElement(By.xpath("(//textarea)[4]"));
		PresentAddress.sendKeys("Present address is present only ");
		
			WebElement PermanentAddress=driver.findElement(By.xpath("(//textarea)[5]"));
		PermanentAddress.sendKeys("permanant address is permanant only");
		
		WebElement pincode=driver.findElement(By.xpath("(//input)[35]"));
		pincode.sendKeys("243456");
		
		WebElement button=driver.findElement(By.xpath("(//input)[37]"));
		button.click();
	
		
	}
}