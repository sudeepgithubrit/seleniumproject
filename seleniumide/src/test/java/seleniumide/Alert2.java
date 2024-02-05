package seleniumide;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert2 {
	public static void main(String[] args) throws Throwable {
		 ChromeOptions option = new ChromeOptions();
		  ChromeDriver driver= new ChromeDriver(option);
		  driver.get("https://demo.automationtesting.in/Alerts.html");
		  WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
	      JavascriptExecutor js1 = (JavascriptExecutor) driver; 
	      js1.executeScript("arguments[0].scrollIntoView();", element);
		  element.click();
		  driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		  Alert alert = driver.switchTo().alert();
         String alertMessage= driver.switchTo().alert().getText();
         System.out.println(alertMessage);
			alert.accept();
}
}
