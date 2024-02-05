package seleniumide;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class textbox {
	 public static void main(String[] args) {
		  ChromeOptions option = new ChromeOptions();
		  ChromeDriver driver= new ChromeDriver(option);
		  driver.get("https://demoqa.com/text-box");
		  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("abc");
		  driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("abc@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("asdfghjk");
		  driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("dfghjkl");
		  WebElement element = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
	      JavascriptExecutor js = (JavascriptExecutor) driver; 
	      js.executeScript("arguments[0].scrollIntoView();", element);
		  element.click();
		  WebElement elem = driver.findElement(By.xpath("//*[@id=\"output\"]/div"));
		  String output=elem.getText();
		  System.out.println("output"+ output);
		  
	  }
}
