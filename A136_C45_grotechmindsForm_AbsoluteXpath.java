package Xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A136_C45_grotechmindsForm_AbsoluteXpath 
{
	//https://grotechminds.com/registeration-form/
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		WebElement A1=driver.findElement(By.id("firstName"));
		A1.click();
		WebElement A2= driver.findElement(By.xpath("((((((((((/html/body/div)[2]/div)[2]/div)[1]/div)[2]/div)[1]/div)[1]/div)[1]/div)[1]/form)[1]/input)[1]"));
		A2.sendKeys("Anusha");
		WebElement A3= driver.findElement(By.xpath("((((((((((/html/body/div)[2]/div)[2]/div)[1]/div)[2]/div)[1]/div)[1]/div)[1]/div)[1]/form)[1]/input)[2]"));
		A3.sendKeys("Channa");
		WebElement A4= driver.findElement(By.xpath("((((((((((/html/body/div)[2]/div)[2]/div)[1]/div)[2]/div)[1]/div)[1]/div)[1]/div)[1]/form)[1]/input)[3]"));
		A4.sendKeys("Anusha@gmail.com");
		WebElement A5= driver.findElement(By.xpath("((((((((((/html/body/div)[2]/div)[2]/div)[1]/div)[2]/div)[1]/div)[1]/div)[1]/div)[1]/form)[1]/input)[4]"));
		A5.sendKeys("9876543210");
	
		WebElement A6= driver.findElement(By.xpath("((((((((((/html/body/div)[2]/div)[2]/div)[1]/div)[2]/div)[1]/div)[1]/div)[1]/div)[1]/form)[1]/input)[5]"));
		A6.sendKeys("AdharCard1234");
		WebElement A7= driver.findElement(By.xpath("((((((((((/html/body/div)[2]/div)[2]/div)[1]/div)[2]/div)[1]/div)[1]/div)[1]/div)[1]/form)[1]/input)[6]"));
		A7.sendKeys("PanCard1234");
		WebElement A8= driver.findElement(By.xpath("((((((((((/html/body/div)[2]/div)[2]/div)[1]/div)[2]/div)[1]/div)[1]/div)[1]/div)[1]/form)[1]/input)[7]"));
		A8.click();
}
}