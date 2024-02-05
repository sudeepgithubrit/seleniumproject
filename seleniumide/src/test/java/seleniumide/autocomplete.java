package seleniumide;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class autocomplete {
	public static void main(String[] args) throws Throwable {
		 ChromeOptions option = new ChromeOptions();
		  ChromeDriver driver= new ChromeDriver(option);
		  driver.get("https://demoqa.com/auto-complete");
		  driver.findElement(By.id("autoCompleteMultipleInput")).sendKeys("red");
		  driver.findElement(By.id("autoCompleteMultipleInput")).sendKeys(Keys.ENTER);
}
}
