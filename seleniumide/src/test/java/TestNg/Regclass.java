package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Regclass {
	 WebDriver driver = new ChromeDriver();
@BeforeClass
public void openbrowser() {
	
	driver.manage().window().maximize();
    driver.get("https://demo.automationtesting.in/Register.html");
}
@Test
public void actions () {
	 
	String Title = "Register";
	Assert.assertEquals(driver.getTitle(), Title);
	WebElement ele1=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
	ele1.sendKeys("abc");
	String firstname= "abc";
	Assert.assertEquals(ele1.getAttribute("value"), firstname);
	WebElement ele2=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
	ele2.sendKeys("d");
	String lastname= "d";
	Assert.assertEquals(ele2.getAttribute("value"), lastname);
	
	
}
@AfterClass
public void closeBrowser() {
	driver.quit();
}
}

