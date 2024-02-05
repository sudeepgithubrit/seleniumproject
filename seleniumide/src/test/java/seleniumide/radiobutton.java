package seleniumide;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class radiobutton {
	public static void main(String[] args) {
		 ChromeOptions option = new ChromeOptions();
		  ChromeDriver driver= new ChromeDriver(option);
		  driver.get("https://demoqa.com/text-box");
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,350)", "");
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[3]")).click();
		 WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
	      JavascriptExecutor js1 = (JavascriptExecutor) driver; 
	      js1.executeScript("arguments[0].scrollIntoView();", element);
		  element.click();
}
}
