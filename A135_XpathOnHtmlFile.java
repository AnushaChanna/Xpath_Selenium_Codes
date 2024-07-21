package Xpath_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A135_XpathOnHtmlFile 
{
public static void main(String[] args)
{
ChromeDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/LENOVO/Desktop/learningHTML1.html");
driver.manage().window().maximize();
WebElement C1=driver.findElement(By.xpath("(/html/body/input)[1]"));
C1.sendKeys("Anusha Channa");
WebElement C2=driver.findElement(By.xpath("(/html/body/input)[2]"));
C2.sendKeys("Anusha");
WebElement C3=driver.findElement(By.xpath("(/html/body/input)[3]"));
C3.sendKeys("A@12345");
WebElement C4=driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
C4.sendKeys("Anusha");


WebElement C5=driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
C5.click();
WebElement C6=driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
C6.click();
WebElement C7=driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
C7.click();

WebElement C8=driver.findElement(By.xpath("(/html/body/input)[4]"));
C8.click();
WebElement C9=driver.findElement(By.xpath("(/html/body/input)[5]"));
C9.click();
WebElement C10=driver.findElement(By.xpath("(/html/body/input)[6]"));
C10.click();

}
}
