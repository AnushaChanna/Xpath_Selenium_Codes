package Xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A143_Amazon_Dropdown_Searchingbooks 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement A1=driver.findElement(By.id("searchDropdownBox"));
		Select s1 =new Select(A1);
		
		//Select class method 1 - selectByVisibleText
		//s1.selectByVisibleText("Books");
		
		//Select class method 2 - selectByValue
		s1.selectByValue("search-alias=stripbooks");
		
		//Select class method 3 - selectByIndex
		//s1.selectByIndex(11);

		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("comedy books");
		
		//search.sendKeys(Keys.ENTER); // after searching for comedy books directly clicking enter
		
		WebElement click = search.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		click.click(); // after searching for comedy books clicking on search button
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
