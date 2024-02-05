package seleniumide;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle {
	public static void main(String[] args) throws Throwable {
		 ChromeOptions option = new ChromeOptions();
		  ChromeDriver driver= new ChromeDriver(option);
		  driver.get("https://demoqa.com/browser-windows");
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,250)", "");
		  driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();
		  String mainWindowHandle = driver.getWindowHandle();
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator();
	        while (iterator.hasNext()) {
	            String ChildWindow = iterator.next();
	                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
	                driver.switchTo().window(ChildWindow);
	                WebElement text = driver.findElement(By.id("sampleHeading"));
	                System.out.println("Heading of child window is " + text.getText());
	            }
}
	}
}
