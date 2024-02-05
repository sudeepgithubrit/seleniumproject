package seleniumide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class frames {
	public static void main(String[] args) throws Throwable {
		 ChromeOptions option = new ChromeOptions();
		  ChromeDriver driver= new ChromeDriver(option);
		  driver.get("https://demoqa.com/frames");
		  driver.switchTo().frame("frame1");
         WebElement frameText=driver.findElement(By.id("sampleHeading"));
         System.out.println("text"+frameText.getText());
         driver.switchTo().defaultContent();
         driver.switchTo().frame("frame2");
         WebElement frameText1=driver.findElement(By.id("sampleHeading"));
         System.out.println("text"+frameText1.getText());
         driver.switchTo().defaultContent();
         driver.quit();
		
	}
}
